package flowchartToHtmlExamples

import static yamtl.dsl.Rule.*

import org.eclipse.emf.ecore.EPackage

import yamtl.core.YAMTLModuleGroovy
import yamtl.groovy.YAMTLGroovyExtensions_dynamicEMF

class Query extends YAMTLModuleGroovy {
	
	public int count = 0
	
    public Query(EPackage flowchartPk) {

header().in('in', flowchartPk)

ruleStore([
    rule('Transition')
        .in('t', flowchartPk.Transition)
        .query()
		.endWith{
			count++
			println("processed successfully")
		}
])

    }
}