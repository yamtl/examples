package linkedListReversal

import static org.junit.Assert.assertTrue;

import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.junit.jupiter.api.Test

import yamtl.core.YAMTLModule
import yamtl.groovy.YAMTLGroovyExtensions
import yamtl.utils.EMFComparator

class ReverseLinkedList_inPlace_Test extends YAMTLModule {
	final BASE_PATH = 'model'
	
	//@Test
	def void testLinkedList_inPlace() {
		// model transformation execution example
		def res = YAMTLModule.preloadMetamodel(BASE_PATH + '/LinkedList.ecore') as Resource
		def xform = new ReverseLinkedList_inPlace(res.contents[0] as EPackage)
		
		xform.setInplace(true)
		
		xform.withStagedExecution = false
		xform.stageUpperBound = 1
		
		xform.loadInputModels(['model': BASE_PATH + '/inputList.xmi'])
		xform.execute()
		
		
		// TODO: FIX saveOutputModels for inOut models
		xform.saveOutputModels(['model': BASE_PATH + '/outputList.xmi'])

		// test assertion
		def actualModel = xform.getOutputModel('model')
		EMFComparator comparator = new EMFComparator();
		def expectedResource = xform.loadModel(BASE_PATH + '/expectedOutput.xmi', false)
		assertTrue( comparator.equals(expectedResource.getContents(), actualModel.getContents()) );
		
	}

}
