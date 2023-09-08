package flowchartToHtmlExamples
import static org.junit.Assert.assertTrue;

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.junit.jupiter.api.Test

import flowchartToHtmlExamples.ToMany
import yamtl.core.YAMTLModule
import yamtl.groovy.YAMTLGroovyExtensions_dynamicEMF
import yamtl.utils.EMFComparator

class ToManyTest extends YAMTLModule {

    final BASE_PATH = 'model'

    @Test
    def void testToMany() {
        // model transformation execution example
        def src_metamodel = YAMTLModule.loadMetamodel(BASE_PATH + '/flowchart.ecore') as EPackage
        def tgt_metamodel = YAMTLModule.loadMetamodel(BASE_PATH + '/html.ecore') as EPackage

        def xform = new ToMany(src_metamodel, tgt_metamodel)
		
		//Optionally, you can comment the above line and run the below line to check out toManyCap
		//def xform = new ToManyCap(src_metamodel, tgt_metamodel)
        xform.loadInputModels(['in': BASE_PATH + '/wakeup.xmi'])
        xform.execute()
        xform.saveOutputModels(['out': BASE_PATH + '/toManyOutput.xmi'])
    }
}
