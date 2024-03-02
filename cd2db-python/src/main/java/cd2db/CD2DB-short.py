from yamtl.core import YAMTLModule
from yamtl.dsl.Rule import rule
from yamtl.dsl.Helper import staticAttribute
from java.util.function import Supplier
from java.lang import Runnable
from org.eclipse.emf.ecore import EObject, EPackage
from org.eclipse.emf.ecore.impl import DynamicEObjectImpl
from org.eclipse.emf.ecore.util import EcoreUtil
from java.util import List



##################################################################
# ACCESSORS and MUTATORS:
# to add syntactic sugar to use eGet/eSet with . notation
##################################################################

class ExtendedDynamicEObject:
    def __init__(self, dynamic_eobject):
        # Directly set the _dynamic_eobject attribute
        self.__dict__['_dynamic_eobject'] = dynamic_eobject

    def __getattr__(self, prop_name):
        # Access the _dynamic_eobject attribute directly from __dict__ to avoid recursion
        dynamic_eobject = self.__dict__['_dynamic_eobject']

        if prop_name == 'eClass':
            return getattr(dynamic_eobject, 'eClass')

        eclass_instance = getattr(dynamic_eobject, 'eClass')()
        feature = eclass_instance.getEStructuralFeature(prop_name)
        if feature:
            value = getattr(dynamic_eobject, 'eGet')(feature)
            if isinstance(value, List):
                # Apply ExtendedDynamicEObject to each element in the list
                extended_list = [ExtendedDynamicEObject(item)  if isinstance(item, EObject) else item for item in value ]
                return extended_list
            if isinstance(value,EObject):
                return ExtendedDynamicEObject(value)
            else:
                return value
        else:
            raise RuntimeError ("property " + prop_name + " not known")

    def __setattr__(self, prop_name, value):
        if prop_name == "_dynamic_eobject":
            # Directly set the _dynamic_eobject attribute in the instance dictionary
            self.__dict__[prop_name] = value
        else:
            # For other attributes, use the standard mechanism
            dynamic_eobject = self.__dict__['_dynamic_eobject']
            feature = getattr(dynamic_eobject, 'eClass')().getEStructuralFeature(prop_name)
            if feature:
                getattr(dynamic_eobject, 'eSet')(feature, value)
            else:
                raise RuntimeError ("property " + prop_name + " not known")

# Adds accessor/mutator methods to members of a list
def marshall(list):
    return [ExtendedDynamicEObject(item) if isinstance(item, EObject) else item for item in list]
# Obtains the original object
def unmarshall(list):
    return [item.__dict__['_dynamic_eobject'] for item in list]


##################################################################
# ACTION : Runnable cannot be declared inline
##################################################################
class Action(Runnable):
    def __init__(self, module):
        self.module = module
    def run(self):
        # Your code to be executed when the Runnable is run
        print("")





##################################################################
# OUTPUT OBJECT INITIALIZATION ACTIONS
# One per rule, per target element
##################################################################

class ClassToTable_t_action(Action):
    def run(self):
        c = self.module.c()
        t = self.module.t()
        
        t.name = c.name
        # FIXME: replace extend_list with a method that overrides YAMTLModule::fetch
        filtered_list = unmarshall([a for a in c.attr if not a.multiValued])
        
        t.col += self.module.fetch(filtered_list, "col")

class DataType2Type_type_action(Action):
    def run(self):
        dt = self.module.dt()
        type = self.module.type()
        type.name = dt.name

class DataTypeAttribute2Column_col_action(Action):
    def run(self):
        att = self.module.att()
        col = self.module.col()
        col.name = att.name
        col.type = self.module.fetch(att.type)

class MultiValuedDataTypeAttribute2Column_t_action(Action):
    def run (self):
        att = self.module.att()
        t = self.module.t()
        t.name = att.owner.name + "_" + att.name
                    
class MultiValuedDataTypeAttribute2Column_id_action(Action):
    def run (self):
        att = self.module.att()
        id = self.module.id()
        id.name = att.owner.name + "Id" # FIXME: lower case in first letter
        #FIXME: define helper
        # id.type = self.module.fetch("objectIdType")
        
class MultiValuedDataTypeAttribute2Column_col_action(Action):
    def run (self):
        att = self.module.att()
        col = self.module.col()
        

##################################################################
# TRANSFORMATION DEFINITION: rules and managed helpers
##################################################################

class CD2DB(YAMTLModule):

    def __init__(self, CD, DB):
        
        self.header().in('cd', CD).out('db', DB)
            
        self.ruleStore([
            rule('ClassToTable')
                .in('c', CD.getEClassifier('Class'))
                .out('t', DB.getEClassifier('Table'), ClassToTable_t_action(self)),
                
            rule('DataType2Type')
                .in('dt', CD.getEClassifier('DataType'))
                .out('type', DB.getEClassifier('Type'), DataType2Type_type_action(self)),
            
            rule("DataTypeAttribute2Column")
                .in("att", CD.getEClassifier("Attribute"))
                    .filter(lambda :
                        self.att().type.eClass().name == "DataType"
                        and 
                        not self.att().multiValued
                    )
                .out("col", DB.getEClassifier("Column"), DataTypeAttribute2Column_col_action(self)),
                
            rule("MultiValuedDataTypeAttribute2Column")
                .in("att", CD.getEClassifier("Attribute"))
                    .filter(lambda :
                        self.att().type.eClass().name == "DataType"
                        and 
                        self.att().multiValued
                    )
                .out("t", DB.getEClassifier("Table"), MultiValuedDataTypeAttribute2Column_t_action(self))         
                .out("id", DB.getEClassifier("Column"), MultiValuedDataTypeAttribute2Column_id_action(self))                
                .out("col", DB.getEClassifier("Column"), MultiValuedDataTypeAttribute2Column_col_action(self)),   
                
            # FIXME: complete
            # rule("ClassAttribute2Column")
            #     .in("att", CD.getEClassifier("Attribute"))
            #         .filter(lambda :
            #             self.att().type.eClass().name == "Class"
            #             and 
            #             not self.att().multiValued
            #         )
            #     .out("col", DB.getEClassifier("Column"), DataTypeAttribute2Column_col_action(self)),
            #
            # rule("MultiValuedClassAttribute2Column")
            #     .in("att", CD.getEClassifier("Attribute"))
            #         .filter(lambda :
            #             self.att().type.eClass().name == "Class"
            #             and 
            #             self.att().multiValued
            #         )
            #     .out("t", DB.getEClassifier("Table"), MultiValuedDataTypeAttribute2Column_t_action(self))         
            #     .out("id", DB.getEClassifier("Column"), MultiValuedDataTypeAttribute2Column_id_action(self))                
            #     .out("col", DB.getEClassifier("Column"), MultiValuedDataTypeAttribute2Column_col_action(self)),                
        ])
        
        
    def __getattr__(eObj,featureName):
        return 

    # NON-MANAGED HELPERS: to fetch objects from the execution context
    def c(self):
        return ExtendedDynamicEObject(self.fetch('c'))
    def att(self):
        return ExtendedDynamicEObject(self.fetch('att'))
    def dt(self):
        return ExtendedDynamicEObject(self.fetch('dt'))

    def t(self):
        return ExtendedDynamicEObject(self.fetch('t'))
    def id(self):
        return ExtendedDynamicEObject(self.fetch('id'))
    def col(self):
        return ExtendedDynamicEObject(self.fetch('col'))
    def type(self):
        return ExtendedDynamicEObject(self.fetch('type'))



##################################################################
# TRANSFORMATION CONFIGURATION
##################################################################

inputModelPath = 'sourceModel.xmi'

cdRes = YAMTLModule.preloadMetamodel('CD.emf')
relRes = YAMTLModule.preloadMetamodel('Relational.emf')
xform = CD2DB(cdRes.contents.get(0) , relRes.contents.get(0))

# PREPARE MODELS
xform.loadInputModels({'cd': inputModelPath})

# EXECUTE TRAFO
xform.execute()

# STORE MODELS
outputModelPath = './output.xmi'
actualModel = xform.saveOutputModels({'db': outputModelPath})
# Assuming there's a method to save the model, add that here
# e.g., xform.saveOutputModel(actualModel, outputModelPath)
