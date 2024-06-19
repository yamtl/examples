package queryDsl

import org.junit.jupiter.api.Test
import static org.junit.jupiter.api.Assertions.assertEquals

class QueryActivityDsl_test {

	@Test
	def void test_missing_tool_name() {
		def mmPath = './model/activity_and_tool_lang.ecore'
		def modelPath = './model/expected_output_cd2db_activity.xmi'
		
		String result = "";
		
		def queryDef = [
			context: 'Action',
			where: { it.outputType == 'puml' },
			query: { 
				result += """
${it.sourcePanel?.id} |-{${it.sourceButton?.id ?: 'MISSING'}(${
    it.arguments.collect { it.key + '=' + it.value }.join(', ')
})}-> ${it.output?.id} [${it.outputConsole?.id ?: ''}]
"""
			}
		]
		
		QueryActivityDsl.runQuery(mmPath, modelPath, queryDef)
		
		assertEquals("""
panel-smm |-{MISSING(metamodel=panel-smm)}-> panel-smm-diagram []

panel-tmm |-{MISSING(metamodel=panel-tmm)}-> panel-tmm-diagram []

panel-smodel |-{MISSING(metamodel=panel-smm, model=panel-smodel)}-> panel-smodel-diagram []

panel-tmodel |-{MISSING(metamodel=panel-tmm, model=panel-tmodel)}-> panel-tmodel-diagram []
""", result)
	}
	
	
	
	
	
	
	@Test
	def void test_with_tool_name() {
		def mmPath = './model/activity_and_tool_lang.ecore'
		def modelPath = './model/expected_output_cd2db_activity_with_tool.xmi'
		
		String result = "";
		
		def queryDef = [
			context: 'Action',
			where: { it.outputType == 'puml' },
			query: {
				result += """
${it.sourcePanel?.id} |-{${it.sourceButton?.id ?: 'MISSING'}(${
    it.arguments.collect { it.key + '=' + it.value }.join(', ')
})}-> ${it.output?.id} [${it.outputConsole?.id ?: ''}]
"""
			}
		]
		

		QueryActivityDsl.runQuery(mmPath, modelPath, queryDef)
		
		assertEquals("""
panel-smm |-{model-panel-emfatic2cd-button(metamodel=panel-smm)}-> panel-smm-diagram []

panel-tmm |-{model-panel-emfatic2cd-button(metamodel=panel-tmm)}-> panel-tmm-diagram []

panel-smodel |-{xmi2od-button(metamodel=panel-smm, model=panel-smodel)}-> panel-smodel-diagram []

panel-tmodel |-{xmi2od-button(metamodel=panel-tmm, model=panel-tmodel)}-> panel-tmodel-diagram []
""", result)
	}
}