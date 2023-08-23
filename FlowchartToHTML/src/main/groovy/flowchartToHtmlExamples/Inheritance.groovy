package flowchartToHtmlExamples
import static yamtl.dsl.Rule.*

import org.eclipse.emf.ecore.EPackage

import yamtl.core.YAMTLModule
import yamtl.groovy.YAMTLGroovyExtensions_dynamicEMF

class Inheritance extends YAMTLModule {
    public Inheritance(EPackage flowchartPk, EPackage htmlPk) {
        YAMTLGroovyExtensions_dynamicEMF.init(this)

        header().in("in", flowchartPk).out("out", htmlPk)

        ruleStore([

                rule('Flowchart2H1')
                        .isAbstract()
                        .in("e", flowchartPk.Flowchart)
                        .out("h1", htmlPk.H1, {
                            h1.value = "Flowchart " + e.name //Assigns the name of the flowchart to the value of the h1 element
                        }),

                rule('Subflow2H1')
                        .inheritsFrom(['Flowchart2H1'])
                        .in("e", flowchartPk.Subflow)
                        .out("h1", htmlPk.H1, {
                            h1.value = "Action " + h1.value
                        })
        ])
    }
}