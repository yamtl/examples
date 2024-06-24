package education_platform

import org.junit.jupiter.api.Test
import static org.junit.jupiter.api.Assertions.assertTrue

import org.eclipse.emf.ecore.EPackage

import yamtl.groovy.YAMTLGroovyExtensions
import yamtl.utils.EMFComparator

class ActivityAndToolLoad_test {

	@Test
	void test_load_cd2db_activity() {
		def inputModel = './model/cd2db_activity.yml'
				
		def activityPk = ActivityAndToolLoad.preloadMetamodel('./model/activity_and_tool_lang.emf').getContents().get(0) as EPackage
		
		def xform = new ActivityAndToolLoad(activityPk)
		xform.loadInputModels(['yaml': inputModel])
		xform.execute()
		
		xform.saveOutputModels(['activity': './model/output.xmi'])
		def actualModel = xform.getModelResource('activity')
		
		EMFComparator comparator = new EMFComparator();
		def expectedRes = xform.loadModel('model/expected_output_cd2db_activity.xmi', false)
		def assertionResult =  comparator.equals(expectedRes.getContents(), actualModel.getContents())
		assertTrue(assertionResult);
	}
	
	@Test
	void test_load_cd2db_activity_with_tool() {
		def inputModel = './model/cd2db_activity_with_tool.yml'
				
		def activityPk = ActivityAndToolLoad.preloadMetamodel('./model/activity_and_tool_lang.emf').getContents().get(0) as EPackage
		
		def xform = new ActivityAndToolLoad(activityPk)
		xform.loadInputModels(['yaml': inputModel])
		xform.execute()
		
		xform.saveOutputModels(['activity': './model/output.xmi'])
		def actualModel = xform.getModelResource('activity')
		
		EMFComparator comparator = new EMFComparator();
		def expectedRes = xform.loadModel('model/expected_output_cd2db_activity_with_tool.xmi', false)
		def assertionResult =  comparator.equals(expectedRes.getContents(), actualModel.getContents())
		assertTrue(assertionResult);
	}
	
	
	@Test
	void test_load_activity_inspection() {
		def inputModel = './model/yamtl-activity-inspection.yml'
				
		def activityPk = ActivityAndToolLoad.preloadMetamodel('./model/activity_and_tool_lang.ecore').getContents().get(0) as EPackage
		
		def xform = new ActivityAndToolLoad(activityPk)
		xform.loadInputModels(['yaml': inputModel])
		xform.execute()
		
		xform.saveOutputModels(['activity': './model/output.xmi'])
		def actualModel = xform.getModelResource('activity')
		
		EMFComparator comparator = new EMFComparator();
		def expectedRes = xform.loadModel('model/expected_output_activity_inspection.xmi', false)
		def assertionResult =  comparator.equals(expectedRes.getContents(), actualModel.getContents())
		assertTrue(assertionResult);
	}
	
	@Test
	void test_load_activity_inspection_with_tools() {
		def inputModel = './model/yamtl-activity-inspection-with-tool.yml'
				
		def activityPk = ActivityAndToolLoad.preloadMetamodel('./model/activity_and_tool_lang.ecore').getContents().get(0) as EPackage
		
		def xform = new ActivityAndToolLoad(activityPk)
		xform.loadInputModels(['yaml': inputModel])
		xform.execute()
		
		xform.saveOutputModels(['activity': './model/output.xmi'])
		def actualModel = xform.getModelResource('activity')
		
		EMFComparator comparator = new EMFComparator();
		def expectedRes = xform.loadModel('model/expected_output_activity_inspection_with_tool.xmi', false)
		def assertionResult =  comparator.equals(expectedRes.getContents(), actualModel.getContents())
		assertTrue(assertionResult);
	}

}
