package flowchartToHtmlExamples
import static yamtl.dsl.Rule.*

import org.eclipse.emf.ecore.EPackage

import yamtl.core.YAMTLModule
import yamtl.groovy.YAMTLGroovyExtensions_dynamicEMF

class Override extends YAMTLModule {
	public Override(EPackage flowchartPk, EPackage htmlPk) {
		YAMTLGroovyExtensions_dynamicEMF.init(this)

		header().in("in", flowchartPk).out("out", htmlPk)

		ruleStore([
				rule('Flowchart2H1')
                        .in("e", flowchartPk.Flowchart)
                        .out("h1", htmlPk.H1, {
							//Assigns the name of the flowchart to the value of the h1 element
                            h1.value = "Flowchart " + e.name 
                        }),

                rule('Subflow2H1')
                        .inheritsFrom(['Flowchart2H1'])
                        .in("e", flowchartPk.Subflow)
                        .out("h1", htmlPk.H1, {
							
							//If h1 value is inherited then it is not null, else it is null
							if(h1.value !== null) {
								h1.value = "Subflow " + h1.value
							} else {
								h1.value = "Subflow " + e.name //Overridden output object
							}
                        //Override the parent rule's h1 output object so the one in child rule is used    
                        }) 
		])
	}
}