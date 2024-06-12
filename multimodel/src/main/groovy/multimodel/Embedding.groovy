package multimodel;

import static yamtl.dsl.Rule.*

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage

import yamtl.core.YAMTLModule;
import yamtl.groovy.YAMTLGroovyExtensions_dynamicEMF

public class Embedding extends YAMTLModule {
	
	def List<String> inconsistencyList = []
	
	public Embedding(EPackage CD) {
		
		YAMTLGroovyExtensions_dynamicEMF.init( this )
		
		header().in('model1', CD).in('model2', CD)
		
		ruleStore([
			rule('Class')
				.in('c1', 'model1', CD.Class)
					.filter { 
						EObject c2 = allInstances('model2',CD.Class).find{ it.name == c1.name}
						c2 == null
					}
				.query()
				.endWith({
					inconsistencyList << "${c1.name} not in model2"
				})
		])
	}
	
}
