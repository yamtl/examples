package flowchartToHtmlExamples
import static yamtl.dsl.Rule.*

import org.eclipse.emf.ecore.EPackage

import yamtl.core.YAMTLModule
import yamtl.groovy.YAMTLGroovyExtensions_dynamicEMF

class ToMany extends YAMTLModule {
    public ToMany(EPackage flowchartPk, EPackage htmlPk) {
        YAMTLGroovyExtensions_dynamicEMF.init(this)

        header().in("in", flowchartPk).out("out", htmlPk)

        ruleStore([
                rule('Action2Elements')
						.toMany()
                        .in("a", flowchartPk.Action).filter { !a.outgoing.isEmpty() }
                        .out("title", htmlPk.H1, {
                            title.value = a.name
						})
                        .out("link", htmlPk.A, {
                            link.value = "Next steps"
                            link.ahref = a.outgoing.first().target.name
                        })
                        .out("container", htmlPk.DIV, {
							// we can refer to output variables declared within the same rule directly
                            container.children.add(title)
                            container.children.add(link)
                        })
        ])
    }
}