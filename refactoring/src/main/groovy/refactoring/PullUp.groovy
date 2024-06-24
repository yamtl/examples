package refactoring

import static yamtl.dsl.Helper.*
import static yamtl.dsl.Rule.*

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EcorePackage

import yamtl.core.YAMTLModuleGroovy

class PullUp extends YAMTLModuleGroovy {
	public PullUp(EcorePackage EMF) {
		
header().inOut("emf", EcorePackage.eINSTANCE)
ruleStore([
	
	rule('PullUpAttribute')
		.priority(0)
		.in('parent', EMF.EClass)
		.in('child', EMF.EClass).filter {
			child.EAllSuperTypes.contains(parent)
		}
		.using("attributes", {
			def children = childrenClasses(parent,[:])
			def attributes = child.EStructuralFeatures.findAll{att1 ->
				children.every{ other_child ->
					other_child.EStructuralFeatures.any{ att2 ->
						att1.name==att2.name && att1.EType==att2.EType
					}
				}
			}
			return attributes
		})
		.globalFilter{
			!attributes.empty
		}
		.out('parent', EMF.EClass, {
			parent.EStructuralFeatures.addAll(attributes)
		}),
	
	rule('DeleteSubclassStructuralFeature')
		.priority(1)
		.isAbstract()
		.in('subF', EMF.EStructuralFeature)
		.in('superF', EMF.EStructuralFeature).filter {
			(
				(subF.EContainingClass).EAllSuperTypes.contains(superF.EContainingClass)
				&&
				subF.name == superF.name
			)
		}
		.out('subF', EMF.EStructuralFeature).drop(),
	
	rule('DeleteSubclassAttribute')
		.priority(1)
		.inheritsFrom(['DeleteSubclassStructuralFeature'])
		.in('subF', EMF.EAttribute)
		.out('subF', EMF.EAttribute),
	
	rule('DeleteSubclassReference')
		.priority(1)
		.inheritsFrom(['DeleteSubclassStructuralFeature'])
		.in('subF', EMF.EReference)
		.out('subF', EMF.EReference)
	
		
])
helperStore([
	contextualOperation("childrenClasses", {thisObject, argMap ->
		allInstances(EMF.EClass).findAll{ EClass c -> c.EAllSuperTypes.contains(thisObject) }
	})
])


	}
}