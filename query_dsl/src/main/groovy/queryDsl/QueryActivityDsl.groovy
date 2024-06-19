package queryDsl


import java.nio.file.Files
import java.nio.file.Paths
import java.util.Map
import java.util.function.Supplier
import org.junit.jupiter.api.Assertions
import java.io.IOException

import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EPackage
import static org.junit.Assert.assertTrue

import yamtl.core.YAMTLModule
import yamtl.core.YAMTLModule.ExecutionPhase
import untypedModel.ERecord
import untypedModel.UntypedModelPackage
import untypedModel.impl.ERecordImpl

import static yamtl.dsl.Rule.*
import static yamtl.dsl.Helper.*

import prettyprinting.EMFPrettyPrinter

import yamtl.groovy.YAMTLGroovyExtensions
import yamtl.groovy.YAMTLGroovyExtensions_dynamicEMF


class QueryActivityDsl extends YAMTLModule {

	def EPackage activityPk
	
	QueryActivityDsl(EPackage activityPk) {
		YAMTLGroovyExtensions_dynamicEMF.init(this)
		this.activityPk=activityPk
		header().in('activity', activityPk)
	}
	
	void context(Map args) {
		def context = args.context
		
		if (!context) {
			throw new RuntimeException("The context type needs to be given.")
		}
		def where = args.where ?: { true }
		def query = args.query ?: { println(self.toString()) }
		
		ruleStore([
			rule('Query')
				.in('self', YAMTLGroovyExtensions_dynamicEMF.findEClass(activityPk, context))
				.filter({ where.call(self) })
				.query()
				.endWith({ query.call(self) })
		])
	}

	static QueryActivityDsl runQuery(String ecorePath, String xmiPath, List<Map> queryList) {
		for (query in queryList) {
			runQuery(ecorePath, xmiPath, query)
		}	
	}

	static QueryActivityDsl runQuery(String ecorePath, String xmiPath, Map contextArgs) {
		def xform = createAndConfigure(ecorePath, xmiPath, contextArgs)
		xform.execute()
	}
	
	static QueryActivityDsl createAndConfigure(String ecorePath, String xmiPath, Map contextArgs) {
		def activityRes = QueryActivityDsl.preloadMetamodel(ecorePath)
		def activityPk = activityRes.getContents().get(0) as EPackage
		
		def xform = new QueryActivityDsl(activityPk)
		YAMTLGroovyExtensions.init(xform)
		xform.selectedExecutionPhases = ExecutionPhase.MATCH_ONLY

		xform.loadMetamodelResource(activityRes)
		xform.loadInputModels(['activity': xmiPath])
		
		xform.context(contextArgs)
		
		return xform
	}

}

