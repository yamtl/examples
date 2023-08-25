package flowchartToHtmlExamples

import static yamtl.dsl.Rule.*
import static yamtl.dsl.Helper.*

import org.eclipse.emf.ecore.EPackage

import yamtl.core.YAMTLModule
import yamtl.groovy.YAMTLGroovyExtensions_dynamicEMF
import yamtl.groovy.YAMTLGroovyExtensions

class BaseHelper extends YAMTLModule {
	public int i = 0
	
    public BaseHelper(EPackage flowchartPk, EPackage htmlPk) {
        YAMTLGroovyExtensions_dynamicEMF.init(this)

        header().in('in', flowchartPk).out('out', htmlPk)

        ruleStore([

            rule('Flowchart2Heading')
                    .in("f", flowchartPk.Flowchart)
                    .out("h1", htmlPk.H1, {
                        h1.value = f.name
                    }),
            rule('Action2Heading')
                    .in("a", flowchartPk.Action)
                    .out("h1", htmlPk.H1, {
                        h1.value = att // calls the attribute
                    }),
            rule('Decision2Heading')
                    .in("d", flowchartPk.Decision)
                    .out("h1", htmlPk.H1, {
                        h1.value = op(['obj': d])
                    }),
            rule('Transition2Heading')
                    .in("t", flowchartPk.Transition)
                    .out("h1", htmlPk.H1, {
                        h1.value = c_op(t, ['suffix': "_${i++}"])
                    })
        ])
		
		helperStore([
			staticAttribute('att', { 
				// returns a name
				"decision"
			}),
			staticOperation('op', { argsMap ->
				// returns the argument 'obj'
				argsMap.obj.name
			}),
			contextualOperation('c_op', { obj, argsMap ->
				// returns the name of the contextual instance 'obj' appended by the argument 'suffix'
				return obj.name + argsMap['suffix']
			})
		])

    }
	def static void main(String[] args) {
		def mmF = BaseHelper.loadMetamodel('./model/flowchart.emf')
		def mmH = BaseHelper.loadMetamodel('./model/html.emf')
		def xform = new BaseHelper(mmF, mmH)
		YAMTLGroovyExtensions.init(xform)
		xform.loadInputModels(['in': './model/wakeup.xmi'])
		xform.execute()
		xform.saveOutputModels(['out': './model/base_helper_output.xmi'])
	}
}