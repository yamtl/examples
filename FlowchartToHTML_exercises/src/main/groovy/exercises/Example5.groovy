package exercises
import org.eclipse.emf.ecore.EPackage

import yamtl.core.YAMTLModuleGroovy

class Example5 extends YAMTLModuleGroovy {
    public Example5(EPackage flowchartPk, EPackage htmlPk) {

header().in("in", flowchartPk).out("out", htmlPk)

ruleStore([
    //TODO: Create a lazy rule

    //TODO: Create a non-lazy/regular rule

    //TODO: Create a rule that fetches the outputs of the first two rules
])
    }
}