package linkedListReversal

import static org.junit.Assert.assertTrue;

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.junit.jupiter.api.Test

import yamtl.core.YAMTLModule
import yamtl.groovy.YAMTLGroovyExtensions_dynamicEMF
import yamtl.utils.EMFComparator

class ReverseLinkedListTest extends YAMTLModule {
	final BASE_PATH = 'model'
	
	@Test
	def void testLinkedList() {
		// model transformation execution example
		def metamodel = YAMTLModule.loadMetamodel(BASE_PATH + '/LinkedList.ecore') as EPackage
		def xform = new ReverseLinkedList(metamodel)
		xform.loadInputModels(['in': BASE_PATH + '/inputList.xmi'])
		xform.execute()
		xform.saveOutputModels(['out': BASE_PATH + '/outputList.xmi'])

		// test assertion
		def actualModel = xform.getOutputModel('out')
		EMFComparator comparator = new EMFComparator();
		def expectedResource = xform.loadModel(BASE_PATH + '/expectedOutput.xmi', false)
		assertTrue( comparator.equals(expectedResource.getContents(), actualModel.getContents()) );
		
	}

}
