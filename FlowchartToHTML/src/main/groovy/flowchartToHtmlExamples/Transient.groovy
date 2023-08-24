package flowchartToHtmlExamples
import static yamtl.dsl.Rule.*

import org.eclipse.emf.ecore.EPackage

import yamtl.core.YAMTLModule
import yamtl.groovy.YAMTLGroovyExtensions_dynamicEMF

class Transient extends YAMTLModule {
	public Transient(EPackage flowchartPk, EPackage htmlPk) {
		YAMTLGroovyExtensions_dynamicEMF.init(this)

		header().in("in", flowchartPk).out("out", htmlPk)
		
		
		String count
		
		ruleStore([
				rule('Transitions2Div')
					.isTransient()
					.endWith{count = div.children.size().toString()}
					.in("f", flowchartPk.Flowchart)
					.out("div", htmlPk.DIV, {
						div.children.addAll(f.transitions)
					}),
				rule('TransitionsCount')
					.in("flowchart", flowchartPk.Flowchart)
					.out("h1", htmlPk.H1, {
						h1.value = "The "+flowchart.name+" flowchart has "+count+" transitions" 
					})
		])
	}
}