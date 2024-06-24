package solutions
import static yamtl.dsl.Rule.*

import org.eclipse.emf.ecore.EPackage

import yamtl.core.YAMTLModuleGroovy

class Example1 extends YAMTLModuleGroovy {
	public Example1(EPackage flowchartPk, EPackage htmlPk) {

header().in("in", flowchartPk).out("out", htmlPk)

ruleStore([
	rule('FlowchartName2Head')
		.in("flowchart", flowchartPk.Flowchart)
		.out("head", htmlPk.HEAD, {				
			head.value = flowchart.name
		})
		.out("html", htmlPk.HTML, {
			html.head = head 
		})
])

	}
}