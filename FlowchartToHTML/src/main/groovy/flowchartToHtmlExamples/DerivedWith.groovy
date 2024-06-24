package flowchartToHtmlExamples
import static yamtl.dsl.Rule.*

import org.eclipse.emf.ecore.EPackage

import yamtl.core.YAMTLModuleGroovy

class DerivedWith extends YAMTLModuleGroovy {
	public DerivedWith(EPackage flowchartPk, EPackage htmlPk) {
header().in("in", flowchartPk).out("out", htmlPk)

ruleStore([
	rule('Action2Heading')
		.in("a", flowchartPk.Action)
		.in("b", flowchartPk.Action).derivedWith{ 
			def f = a.eContainer()
			f.nodes.first()
		}
		.out("h1", htmlPk.H1, {
			h1.value = b.name
		})
//				rule('Decision2Heading')
//						.in("d", flowchartPk.Decision)
//						.out("h1", htmlPk.H1, {
//							h1.value = d.name
//						}),
//				rule('Transition2Heading')
//						.in("t", flowchartPk.Transition)
//						.out("h1", htmlPk.H1, {
//							h1.value = t.name
//						})
		])

	}
}