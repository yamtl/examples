package solutions
import static yamtl.dsl.Rule.*

import org.eclipse.emf.ecore.EPackage

import yamtl.core.YAMTLModuleGroovy

class Example5 extends YAMTLModuleGroovy {
	
	public Example5(EPackage flowchartPk, EPackage htmlPk) {

header().in("in", flowchartPk).out("out", htmlPk)

ruleStore([
	rule('Node2H1')
		.isLazy()
		.in("in", flowchartPk.Node) 
		.out("out", htmlPk.H1, {
			out.value = in.name
		}),
	rule('Transition2H1')
		.in("t", flowchartPk.Transition)
		.out("h1", htmlPk.H1, {
			h1.value = t.name
		}),
	rule('Flowchart2DIV')
		.in('f', flowchartPk.Flowchart)
		.out('div', htmlPk.DIV, {
			// without LAZY: div.children.addAll(fetch(f.nodes))
			// with LAZY rules
			div.children.addAll(fetch(f.nodes, 'out', 'Node2H1'))
			div.children.addAll(fetch(f.transitions))
		})
		
])

	}

}