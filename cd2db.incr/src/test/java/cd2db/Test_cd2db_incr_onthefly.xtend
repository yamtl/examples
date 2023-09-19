package cd2db

import CD.Attribute
import CD.CDFactory
import CD.Class
import CD.DataType
import org.junit.jupiter.api.Test
import yamtl.core.YAMTLModule.ExecutionMode
import yamtl.utils.EMFComparator

import static org.junit.jupiter.api.Assertions.assertTrue
import yamtl.core.YAMTLModule.IncrementalGranularity

class Test_cd2db_incr_onthefly {
	@Test
	def void testDelta1_changeClassName() {
		var String inputModelPath = '''src/main/java/cd2db/sourceModel.xmi'''
		var String deltaName = 'delta1'
		
		val xform = new cd2db()
		
		xform.adviseWithinThisNamespaceExpressions(#['CD.impl.*']);
		xform.executionMode = ExecutionMode.INCREMENTAL
		
		// PREPARE MODELS
		xform.loadInputModels(#{'cd' -> inputModelPath})
				
		// EXECUTE TRAFO 
		xform.execute()
		
		// DELTA PROPAGATION
		var String forwardDeltaPath
		var String outputModelPath
		
		xform.adaptInputModel('cd');
		
		val cdRes = xform.getModelResource('cd')
		val orderClass = cdRes.allContents.findFirst[it instanceof Class && (it as Class).name=='Order'] as Class
		orderClass.name = 'Invoice'
		
		xform.propagateDelta('cd')


		outputModelPath = '''src/main/java/cd2db/output/targetModel.«deltaName».output.xmi'''
		xform.saveOutputModels(#{'db' -> outputModelPath})

		val actualRes = xform.getOutputModel('db')
		val expectedRes = xform.loadModel('''src/main/java/cd2db/output/targetModel.«deltaName».expected.xmi''', true)
		val comparator = new EMFComparator()
		assertTrue(comparator.equals(expectedRes.contents, actualRes.contents))
		
		
	}
	
	
	@Test
	def void testDelta2_addClass() {
		var String inputModelPath = '''src/main/java/cd2db/sourceModel.xmi'''
		var String deltaName = 'delta2'
		
		val xform = new cd2db()
		
		xform.adviseWithinThisNamespaceExpressions(#['CD.impl.*']);
		xform.executionMode = ExecutionMode.INCREMENTAL
		
		// PREPARE MODELS
		xform.loadInputModels(#{'cd' -> inputModelPath})
				
		// EXECUTE TRAFO 
		xform.execute()
		
		// DELTA PROPAGATION
		var String forwardDeltaPath
		var String outputModelPath
		
		xform.adaptInputModel('cd');
		
		val cdRes = xform.getModelResource('cd')
		val cd = CDFactory.eINSTANCE.createClass
		cd.name = 'Product'
		cdRes.contents.add(cd)
		
		xform.propagateDelta('cd')


		outputModelPath = '''src/main/java/cd2db/output/targetModel.«deltaName».output.xmi'''
		xform.saveOutputModels(#{'db' -> outputModelPath})

		val actualRes = xform.getOutputModel('db')
		val expectedRes = xform.loadModel('''src/main/java/cd2db/output/targetModel.«deltaName».expected.xmi''', true)
		val comparator = new EMFComparator()
		assertTrue(comparator.equals(expectedRes.contents, actualRes.contents))
		
		
	}
	
	
	
	@Test
	def void testDelta3_addAttribute() {
		var String inputModelPath = '''src/main/java/cd2db/sourceModel.xmi'''
		var String deltaName = 'delta3'
		
		val xform = new cd2db()
		
		xform.adviseWithinThisNamespaceExpressions(#['CD.impl.*']);
		xform.executionMode = ExecutionMode.INCREMENTAL
		
		// PREPARE MODELS
		xform.loadInputModels(#{'cd' -> inputModelPath})
				
		// EXECUTE TRAFO 
		xform.execute()
		
		// DELTA PROPAGATION
		var String forwardDeltaPath
		var String outputModelPath
		
		xform.adaptInputModel('cd');
		
		// DELTA
		val cdRes = xform.getModelResource('cd')
		val att = CDFactory.eINSTANCE.createAttribute
		att.name = 'amount'
		val datatypeString = cdRes.allContents.findFirst[it instanceof DataType && (it as DataType).name=='String'] as DataType
		att.type = datatypeString
		val itemClass = cdRes.allContents.findFirst[it instanceof Class && (it as Class).name=='Item'] as Class
		itemClass.attr.add(att)
		
		xform.propagateDelta('cd')


		outputModelPath = '''src/main/java/cd2db/output/targetModel.«deltaName».output.xmi'''
		xform.saveOutputModels(#{'db' -> outputModelPath})

		val actualRes = xform.getOutputModel('db')
		val expectedRes = xform.loadModel('''src/main/java/cd2db/output/targetModel.«deltaName».expected.xmi''', true)
		val comparator = new EMFComparator()
		assertTrue(comparator.equals(expectedRes.contents, actualRes.contents))
		
		
	}
	
	
	
	
	@Test
	def void testDelta4_removeAttribute() {
		var String inputModelPath = '''src/main/java/cd2db/sourceModel.xmi'''
		var String deltaName = 'delta4'
		
		val xform = new cd2db()
		
		xform.adviseWithinThisNamespaceExpressions(#['CD.impl.*']);
		xform.executionMode = ExecutionMode.INCREMENTAL
		
		// PREPARE MODELS
		xform.loadInputModels(#{'cd' -> inputModelPath})
				
		// EXECUTE TRAFO 
		xform.execute()
		
		// DELTA PROPAGATION
		var String forwardDeltaPath
		var String outputModelPath
		
		xform.adaptInputModel('cd');
		
		// DELTA
		val cdRes = xform.getModelResource('cd')
		val itemClass = cdRes.allContents.findFirst[it instanceof Class && (it as Class).name=='Item'] as Class
		itemClass.attr.removeIf[it.name=='date']
		xform.propagateDelta('cd')


		outputModelPath = '''src/main/java/cd2db/output/targetModel.«deltaName».output.xmi'''
		xform.saveOutputModels(#{'db' -> outputModelPath})

		val actualRes = xform.getOutputModel('db')
		val expectedRes = xform.loadModel('''src/main/java/cd2db/output/targetModel.«deltaName».expected.xmi''', true)
		val comparator = new EMFComparator()
		assertTrue(comparator.equals(expectedRes.contents, actualRes.contents))
		
		
	}
	
	
	
	@Test
	def void testDelta5_moveDateFromItemToOrder() {
		var String inputModelPath = '''src/main/java/cd2db/sourceModel.xmi'''
		var String deltaName = 'delta5'
		
		val xform = new cd2db()
		
		xform.adviseWithinThisNamespaceExpressions(#['CD.impl.*']);
		xform.executionMode = ExecutionMode.INCREMENTAL
		
		// PREPARE MODELS
		xform.loadInputModels(#{'cd' -> inputModelPath})
				
		// EXECUTE TRAFO 
		xform.execute()
		
		// DELTA PROPAGATION
		var String forwardDeltaPath
		var String outputModelPath
		
		xform.adaptInputModel('cd');
		
		// DELTA
		val cdRes = xform.getModelResource('cd')
		val itemClass = cdRes.allContents.findFirst[it instanceof Class && (it as Class).name=='Item'] as Class
		val orderClass = cdRes.allContents.findFirst[it instanceof Class && (it as Class).name=='Order'] as Class
		val att = itemClass.attr.filter[it.name=='date'].head as Attribute
		att.owner = orderClass
		xform.propagateDelta('cd')


		outputModelPath = '''src/main/java/cd2db/output/targetModel.«deltaName».output.xmi'''
		xform.saveOutputModels(#{'db' -> outputModelPath})

		val actualRes = xform.getOutputModel('db')
		val expectedRes = xform.loadModel('''src/main/java/cd2db/output/targetModel.«deltaName».expected.xmi''', true)
		val comparator = new EMFComparator()
		assertTrue(comparator.equals(expectedRes.contents, actualRes.contents))
		
		
	}
	
	
	
	@Test
	def void testDelta6_changeAttributeNameOfItems_items() {
		var String inputModelPath = '''src/main/java/cd2db/sourceModel.xmi'''
		var String deltaName = 'delta6'
		
		val xform = new cd2db()
		
		xform.adviseWithinThisNamespaceExpressions(#['CD.impl.*']);
		xform.executionMode = ExecutionMode.INCREMENTAL
		
		// PREPARE MODELS
		xform.loadInputModels(#{'cd' -> inputModelPath})
				
		// EXECUTE TRAFO 
		xform.execute()
		
		// DELTA PROPAGATION
		var String forwardDeltaPath
		var String outputModelPath
		
		xform.adaptInputModel('cd');
		
		// DELTA
		val cdRes = xform.getModelResource('cd')
		val class = cdRes.allContents.findFirst[it instanceof Class && (it as Class).name=='Order'] as Class
		val att = class.attr.filter[it.name=='items'].head as Attribute
		att.name = 'item_list'
		xform.propagateDelta('cd')


		outputModelPath = '''src/main/java/cd2db/output/targetModel.«deltaName».output.xmi'''
		xform.saveOutputModels(#{'db' -> outputModelPath})

		val actualRes = xform.getOutputModel('db')
		val expectedRes = xform.loadModel('''src/main/java/cd2db/output/targetModel.«deltaName».expected.xmi''', true)
		val comparator = new EMFComparator()
		assertTrue(comparator.equals(expectedRes.contents, actualRes.contents))
		
		
	}
}