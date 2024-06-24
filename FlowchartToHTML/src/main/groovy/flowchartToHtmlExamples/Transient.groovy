package flowchartToHtmlExamples
import static yamtl.dsl.Rule.*

import org.eclipse.emf.ecore.EPackage

import yamtl.core.YAMTLModuleGroovy

class Transient extends YAMTLModuleGroovy {
	public Transient(EPackage flowchartPk, EPackage htmlPk) {

header().in("in", flowchartPk).out("out", htmlPk)

// an attribute shared among rules
def count = 0

ruleStore([
	rule('Transitions2Div')
		.isTransient()
		.in("t", flowchartPk.Transition)
		.out("div", htmlPk.DIV, {
			count++
			println(count)
		}),			
	rule('FlowChart')
		.in("f", flowchartPk.Flowchart)
		.out("h1", htmlPk.H1, {
			h1.value = "The ${f.name} flowchart has ${count} transitions".toString()
		})
])

	}
}