package queryDsl

import org.junit.jupiter.api.Test
import static org.junit.jupiter.api.Assertions.assertEquals

class QueryActivityDsl_CD_test {

	@Test
	def void validate_class_unique_name_within_package() {
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
	def void validate_class_unique_name_global() {
		def mmPath = './model/CD.emf'
		def modelPath = './model/cd_model.xmi'
		
		def fails = false;
		def classNames = [] as Set<String>
		
		def queryDef = [
			context: 'Class',
			query: {
				def added = classNames.add(it.name)
				if (!added) fails=true
			}
		]
		
		QueryActivityDsl.runQuery(mmPath, modelPath, queryDef)
		
		assertEquals(false, fails)
	}
	
	
	@Test
	def void validate_attribute_unique_name() {
		def mmPath = './model/CD.emf'
		def modelPath = './model/cd_model.xmi'
		
		def result = 0;
		
		def queryDef = [
			context: 'Class',
			where: { it.attr.size() > 0 },
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