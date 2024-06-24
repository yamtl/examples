package multimodel;

import static yamtl.dsl.Rule.*

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage

import yamtl.core.YAMTLModuleGroovy

public class Embedding extends YAMTLModuleGroovy {
	
	def public List<String> inconsistencyList = []
	
	public Embedding(EPackage CD) {
		
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
