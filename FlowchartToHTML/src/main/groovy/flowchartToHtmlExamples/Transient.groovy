package flowchartToHtmlExamples
import static yamtl.dsl.Rule.*

import org.eclipse.emf.ecore.EPackage

import yamtl.core.YAMTLModule
import yamtl.groovy.YAMTLGroovyExtensions_dynamicEMF

class Transient extends YAMTLModule {
	public Transient(EPackage flowchartPk, EPackage htmlPk) {
		YAMTLGroovyExtensions_dynamicEMF.init(this)

		header().in("in", flowchartPk).out("out", htmlPk)
		
		// an attribute shared among rules
		def count = 0
		
		ruleStore([
			rule('Transitions2Div')
				.priority(0)
				.isTransient()	
				.in("f", flowchartPk.Flowchart)
				.out("div", htmlPk.DIV, {
					div.children.addAll(f.transitions)
					def transitions = f.transitions
					count += f.transitions.size()
					println(count)
				}),
//					.endWith{count = div.children.size().toString()},
				
			rule('TransitionsCount')
				.in("flowchart", flowchartPk.Flowchart)
				.out("h1", htmlPk.H1, {
					h1.value = "The ${flowchart.name} flowchart has ${count} transitions".toString()
				})
		])
	}
}