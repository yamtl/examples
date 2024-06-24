package flowchartToHtmlExamples

import static yamtl.dsl.Rule.*

import org.eclipse.emf.ecore.EPackage

import yamtl.core.YAMTLModuleGroovy

class BaseQuery extends YAMTLModuleGroovy {
    public BaseQuery(EPackage flowchartPk) {
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
		def mm = BaseQuery.loadMetamodel('./model-test/workflow2html/flowchart.emf')
		def query = new BaseQuery(mm)
		query.selectedExecutionPhases = ExecutionPhase.MATCH_ONLY
		query.loadInputModels(['in': './model-test/workflow2html/wakeup.xmi'])
		query.execute()
	}
}