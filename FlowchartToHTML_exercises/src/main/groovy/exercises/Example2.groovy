package exercises
import static yamtl.dsl.Rule.*

import org.eclipse.emf.ecore.EPackage

import yamtl.core.YAMTLModuleGroovy

class Example2 extends YAMTLModuleGroovy {
    public Example2(EPackage flowchartPk, EPackage htmlPk) {

header().in("in", flowchartPk).out("out", htmlPk)

ruleStore([
    //TODO: Update the rule with a .filter{} block
    rule('SelectedTransitions2Text')
        .in("t", flowchartPk.Transition)
        .out("p", htmlPk.P, {
            p.value = "Node: ${t.source.name} --> Transition: ${t.name}".toString()
        })
])
    }
}