package cd2db

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

import yamtl.core.YAMTLModule
import yamtl.groovy.YAMTLGroovyExtensions
import yamtl.groovy.YAMTLGroovyExtensions_dynamicEMF

import static yamtl.dsl.Helper.*;
import static yamtl.dsl.Rule.*;

import Changes.ChangesPackage;
import Changes.ModelChange;
import Changes.ModelChangeSet;

import atl.research.class_.Attribute;
import atl.research.class_.Class;
import atl.research.class_.Class_Package;
import atl.research.class_.DataType;
import atl.research.relational_.Column;
import atl.research.relational_.Relational_Package;
import atl.research.relational_.Table;
import atl.research.relational_.Type;

class CD2DB extends YAMTLModule {

    static String inputModelPath = 'C:/Users/ab373/Documents/git-repos/git-yamtl/incremental-class2relational/models/correctness5/class.xmi'
    static String changePath = 'C:/Users/ab373/Documents/git-repos/git-yamtl/incremental-class2relational/models/correctness5/change.xmi'

	
	
	public static void main(String[] args) {
	    ResourceSet resourceSet = new ResourceSetImpl()
	    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
	            "xmi",
	            new XMIResourceFactoryImpl()
	    )
	
	    // Register source, change, and target metamodels in global registry
	    def CH = ChangesPackage.eINSTANCE
		def CD = Class_Package.eINSTANCE;
		def DB = Relational_Package.eINSTANCE;
	
	    def source = resourceSet.getResource(URI.createFileURI(inputModelPath), true)
	    def changes = resourceSet.getResource(URI.createFileURI(changePath), true)
	    EcoreUtil.resolveAll(resourceSet)
	
	    def xform = new CD2DB(CD, DB)
		YAMTLGroovyExtensions.init(xform)
		
	    xform.adviseWithinThisNamespaceExpressions(["atl.research.class_..*"])
	    xform.setExecutionMode(YAMTLModule.ExecutionMode.INCREMENTAL)
	
	    xform.loadInputResources(["cd": source])
	    xform.execute()
	
	    xform.saveOutputModels(["db": "src/main/java/cd2db/out/out_after_batch.xmi"], ["Table", "Type"])
	    xform.adaptInputModel("cd")
	
	    if (changes.contents.size() > 0) {
	        def change = changes.contents.get(0) as ModelChangeSet
	        change.changes.each { c ->
	            println("Applying change $c")
	            c.apply()
	        }
	    }
	
	    xform.propagateDelta("cd")
	
	    xform.saveOutputModels(["db": "src/main/java/cd2db/out/out_after_prop.xmi"], ["Table", "Type"])
	}
	
	
    CD2DB(EPackage CD, EPackage DB) {
        YAMTLGroovyExtensions_dynamicEMF.init(this)

        def resourceSet = new ResourceSetImpl()
        resourceSet.resourceFactoryRegistry.extensionToFactoryMap.put('xmi', new XMIResourceFactoryImpl())

        EPackage e
        e = Class_Package.eINSTANCE
        e = Relational_Package.eINSTANCE
        e = ChangesPackage.eINSTANCE

        def source = resourceSet.getResource(URI.createFileURI(inputModelPath), true)
        def changes = resourceSet.getResource(URI.createFileURI(changePath), true)
        EcoreUtil.resolveAll(resourceSet)

        header().in('cd', CD).out('db', DB)

		ruleStore([
			rule('ClassToTable')
				.in('c', CD.Class)
				.out('t', DB.Table, {
					t.name = c.name
		
					def list = c.attr.findAll{ !it.multiValued }
					t.col.addAll(fetch(list, 'col'))
		
					t.col.add(key)
					t.key.add(key)
				})
				.out('key', DB.Column, {
					key.name = 'objectId'
					key.type = fetch(fetch('objectIdType'))
				}),
		
			rule('DataType2Type')
				.in('dt', CD.DataType)
				.out('type', DB.Type, {
					type.name = dt.name
				}),
		
			rule('DataTypeAttribute2Column')
				.in('att', CD.Attribute).filter({
					att.type instanceof DataType && !att.multiValued
				})
				.out('col', DB.Column, {
					col.name = att.name
					col.type = fetch(att.type)
				}),
		
			rule('MultiValuedDataTypeAttribute2Column')
				.in('att', CD.Attribute).filter({
					att.type instanceof DataType && att.multiValued
				})
				.out('t', DB.Table, {
					if (att.owner != null && att.owner.name != null)
						t.name = "${att.owner.name}_${att.name}"
					t.col.add(id)
					t.col.add(col)
				})
				.out('id', DB.Column, {
					if (att.owner != null && att.owner.name != null)
						id.name = "${att.owner.name.toLowerCase()}Id"
					id.type = fetch(fetch('objectIdType'))
				})
				.out('col', DB.Column, {
					col.name = att.name
					col.type = fetch(att.type)
				}),
		
			rule('ClassAttribute2Column')
				.in('att', CD.Attribute).filter({
					att.type instanceof Class && !att.multiValued
				})
				.out('col', DB.Column, {
					col.name = "${att.name}Id"
					col.type = fetch(fetch('objectIdType'))
				}),
		
			rule('MultiValuedClassAttribute2Column')
				.in('att', CD.Attribute).filter({
					att.type instanceof Class && att.multiValued
				})
				.out('t', DB.Table, {
					if (att.owner != null && att.owner.name != null)
						t.name = "${att.owner.name}_${att.name}"
					t.col.add(id)
					t.col.add(col)
				})
				.out('id', DB.Column, {
					if (att.owner != null && att.owner.name != null)
						id.name = "${att.owner.name.toLowerCase()}Id"
					id.type = fetch(fetch('objectIdType'))
				})
				.out('col', DB.Column, {
					col.name = "${att.name}Id"
					col.type = fetch(fetch('objectIdType'))
				})
		])
			
        helperStore([
            staticAttribute('objectIdType', {
                allInstances(CD.DataType).find{ it instanceof DataType && it.name == 'Integer' }
            })
        ])
    }


}

