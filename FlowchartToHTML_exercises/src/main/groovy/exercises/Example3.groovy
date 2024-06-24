package exercises
import static yamtl.dsl.Rule.rule

import org.eclipse.emf.ecore.EPackage

import yamtl.core.YAMTLModuleGroovy

class Example3 extends YAMTLModuleGroovy {
    public Example3(EPackage flowchartPk, EPackage htmlPk) {

header().in("in", flowchartPk).out("out", htmlPk)

ruleStore([
    //This parent rule is abstract, so it will not be applied directly
    //but it can be executed by its children
    rule('Flowchart2H1')
        //TODO: Implement the parent rule here
	,
    //This child rule inherits from the previous one
    rule('Subflow2H1')
        //TODO: Implement the child rule here

])

    }
}