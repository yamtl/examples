package flowchartToHtmlExamples

import static yamtl.dsl.Rule.*

import org.eclipse.emf.ecore.EPackage

import yamtl.core.YAMTLModule
import yamtl.groovy.YAMTLGroovyExtensions_dynamicEMF

class BaseQuery extends YAMTLModule {
    public BaseQuery(EPackage flowchartPk) {
        YAMTLGroovyExtensions_dynamicEMF.init(this)

        header().in('in', flowchartPk)

        ruleStore([

                rule('Transition')
                    .in('t', flowchartPk.Transition)
                    .query()
                    .endWith{
						println("processed ${t.name}") 
					}
        ])

    }
	def static void main(String[] args) {
		def mm = BaseQuery.loadMetamodel('./model/flowchart.emf')
		def query = new BaseQuery(mm)
		query.selectedExecutionPhases = ExecutionPhase.MATCH_ONLY
		query.loadInputModels(['in': './model/wakeup.xmi'])
		query.execute()
	}
}