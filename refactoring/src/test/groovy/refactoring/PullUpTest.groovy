package refactoring

import static org.junit.Assert.assertTrue;

import org.eclipse.emf.ecore.EcorePackage
import org.junit.jupiter.api.Test

import refactoring.PullUp
import yamtl.groovy.YAMTLGroovyExtensions
import yamtl.utils.EMFComparator

public class PullUpTest {
	@Test
	def void testRefactoring() {
		def BASE_PATH = "./model"
		def xform = new PullUp(EcorePackage.eINSTANCE)
		xform.setInplace(true)
		xform.withStagedExecution = false
		
		xform.loadInputModels(["emf":BASE_PATH+"/StateMachine.ecore"])
		xform.execute()
		xform.saveOutputModels(["emf":BASE_PATH+"/StateMachine_out.ecore"])
		
		// test assertion
		def actualModel = xform.getModelResource('emf')
		EMFComparator comparator = new EMFComparator();
		def expectedResource = xform.loadModel(BASE_PATH + '/StateMachine_expected.ecore', false)
		
		assertTrue(!actualModel.contents.empty)
		assertTrue( comparator.equals(expectedResource.getContents(), actualModel.getContents()) );
	}
	
}
