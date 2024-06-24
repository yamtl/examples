package flowchartToHtmlExamples
import static yamtl.dsl.Rule.*

import org.eclipse.emf.ecore.EPackage

import yamtl.core.YAMTLModuleGroovy

class Filter extends YAMTLModuleGroovy {
	public Filter(EPackage flowchartPk, EPackage htmlPk) {

header().in("in", flowchartPk).out("out", htmlPk)

String sourceName = "Is it too early?";

ruleStore([
	rule('SelectedTransitions2Text')
		.in("t", flowchartPk.Transition)
		.filter{
			//Only transform those transitions
			//that satisfy the following condition
			t.source.name == "Is it really too early?"
			
		}
		.out("p", htmlPk.P, {
			p.value = t.name
		})
])

	}
}