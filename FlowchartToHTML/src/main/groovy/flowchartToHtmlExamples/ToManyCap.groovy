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
				.toManyCap({2})
                .in("a", flowchartPk.Action)
                .out("title", htmlPk.H1, {
                    title.value = fetch(a, "title", 0).value
                })
                .out("link", htmlPk.A, {
                    link.value = "Next steps"
                    link.ahref = fetch(a, "link", 1).name
                })
                .out("container", htmlPk.DIV, {
                    container.children.add(fetch(a, "title", 0))
                    container.children.add(fetch(a, "link", 1))
                })
        ])
    }
}