package queryDsl

import org.junit.jupiter.api.Test
import static org.junit.jupiter.api.Assertions.assertEquals

class QueryActivityDsl_validation_test {

	@Test
	def void validate_unique_tool_id() {
		def mmPath = './model/activity_and_tool_lang.ecore'
		def modelPath = './model/expected_output_cd2db_activity_with_tool.xmi'
		
		def result = 0;
		
		def queryDef = [
			context: 'ToolConfig',
			query: { 
				def idCounts = it.tools.countBy { it.id }
				def repeatedIds = idCounts.findAll { k, v -> v > 1 }.keySet()
				result = repeatedIds.size()
			}
		]
		
		QueryActivityDsl.runQuery(mmPath, modelPath, queryDef)
		
		assertEquals(0, result)
	}
	
	@Test
	def void validate_unique_toolFunction_id() {
		def mmPath = './model/activity_and_tool_lang.ecore'
		def modelPath = './model/expected_output_cd2db_activity_with_tool.xmi'
		
		def result = 0;
		
		def queryDef = [
            context: 'Tool',
            query: { 
            	def idCounts = it.functions.countBy { it.id }
            	def repeatedIds = idCounts.findAll { k, v -> v > 1 }.keySet()
    			result = repeatedIds.size()
            }
        ]
        		
		QueryActivityDsl.runQuery(mmPath, modelPath, queryDef)
        		
		assertEquals(0, result)
	}

	
	@Test
	def void validate_unique_button_id() {
		def mmPath = './model/activity_and_tool_lang.ecore'
		def modelPath = './model/expected_output_cd2db_activity_with_tool.xmi'
		
		def result = 0;
		
		def queryDef = [
			context: 'Panel',
			query: {
				def idCounts = it.buttons.countBy { it.id }
				def repeatedIds = idCounts.findAll { k, v -> v > 1 }.keySet()
				result = repeatedIds.size()
			}
		]
				

		QueryActivityDsl.runQuery(mmPath, modelPath, queryDef)
				
		assertEquals(0, result)
	}
}