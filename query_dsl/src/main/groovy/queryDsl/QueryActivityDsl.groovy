package queryDsl


import static yamtl.dsl.Rule.*

import org.eclipse.emf.ecore.EPackage

import yamtl.core.YAMTLModule.ExecutionPhase
import yamtl.core.YAMTLModuleGroovy
import yamtl.groovy.YAMTLGroovyExtensions_dynamicEMF


class QueryActivityDsl extends YAMTLModuleGroovy {

	def EPackage activityPk
	
	QueryActivityDsl(EPackage activityPk) {
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
		xform.selectedExecutionPhases = ExecutionPhase.MATCH_ONLY

		xform.loadMetamodelResource(activityRes)
		xform.loadInputModels(['activity': xmiPath])
		
		xform.context(contextArgs)
		
		return xform
	}

}

