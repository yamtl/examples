package flowchartToHtmlExamples
import static yamtl.dsl.Rule.*

import org.eclipse.emf.ecore.EPackage

import yamtl.core.YAMTLModule
import yamtl.groovy.YAMTLGroovyExtensions_dynamicEMF

class ToManyCap extends YAMTLModule {
    public ToManyCap(EPackage flowchartPk, EPackage htmlPk) {
        YAMTLGroovyExtensions_dynamicEMF.init(this)

        header().in("in", flowchartPk).out("out", htmlPk)

        ruleStore([
                rule('Action2Elements')
						.toMany()
                        .in("a", flowchartPk.Action)
						.toManyCap({3})
                        .out("title", htmlPk.H1, {
                            title.value = fetch(a.name, title, 0)
                        })
                        .out("link", htmlPk.A, {
                            link.value = "Next steps"
                            link.ahref = fetch(a.outgoing.target.name, link, 1)
                        })
                        .out("container", htmlPk.DIV, {
                            container.children.add(fetch(a, title, 0))
                            container.children.add(fetch(a, link, 1))
                        })
        ])
    }
}