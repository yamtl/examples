package queryDsl

import org.junit.jupiter.api.Test
import static org.junit.jupiter.api.Assertions.assertEquals

class QueryActivityDsl_CD_test {

	@Test
	def void validate_class_unique_name() {
		def mmPath = './model/CD.emf'
		def modelPath = './model/cd_model.xmi'
		
		def result = 0;
		
		def queryDef = [
			context: 'Package',
			query: { 
				def idCounts = it.classifiers.countBy { it.name }
				def repeatedIds = idCounts.findAll { k, v -> v > 1 }.keySet()
				result = repeatedIds.size()
			}
		]
		
		QueryActivityDsl.runQuery(mmPath, modelPath, queryDef)
		
		assertEquals(0, result)
	}
	
	@Test
	def void validate_attribute_unique_name() {
		def mmPath = './model/CD.emf'
		def modelPath = './model/cd_model.xmi'
		
		def result = 0;
		
		def queryDef = [
			context: 'Class',
			where: { it.attr.size() > 1 },
			query: {
				def idCounts = it.attr.countBy { it.name }
				def repeatedIds = idCounts.findAll { k, v -> v > 1 }.keySet()
				result = repeatedIds.size()
			}
		]
		
		QueryActivityDsl.runQuery(mmPath, modelPath, queryDef)
		
		assertEquals(0, result)
	}
	
}