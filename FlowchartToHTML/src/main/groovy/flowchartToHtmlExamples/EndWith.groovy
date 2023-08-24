package flowchartToHtmlExamples
import static yamtl.dsl.Rule.*

import org.eclipse.emf.ecore.EPackage

import yamtl.core.YAMTLModule
import yamtl.groovy.YAMTLGroovyExtensions_dynamicEMF

class EndWith extends YAMTLModule {
	public EndWith(EPackage flowchartPk, EPackage htmlPk) {
		YAMTLGroovyExtensions_dynamicEMF.init(this)

		header().in("in", flowchartPk).out("out", htmlPk)

		ruleStore([
				rule('Flowchart2Body') //Adds all flowchart elements into the HTML body
						.endWith{
							body.text = f.name //Body's text field has the flowchart name
							body.children.add(b) //The newly created bold text is also added to the body
							body.children.add(div)	//New div block is also added			 
						}
						.in("f", flowchartPk.Flowchart) //Input object is all flowchart elements
						.out("b", htmlPk.B, { 
							b.value = f.name //Flowchart's name is turned into bold
						})
						.out("div", htmlPk.DIV, { 
							div.children.addAll(f.transitions) //A div block contains all transitions
						})
						.out("body", htmlPk.BODY, {
							body.children.addAll(f.nodes) //All flowchart nodes are added to the body
						})
		])

	}
}