package multimodel;

import static yamtl.dsl.Rule.*

import org.eclipse.emf.ecore.EPackage

import yamtl.core.YAMTLModuleGroovy

public class Comparator extends YAMTLModuleGroovy {
	
	
	public Comparator(EPackage CD) {
		
		header().in('model1', CD).in('model2', CD).out('out', CD)
		
		ruleStore([
			rule('MatchPackage')
				.in('p1', 'model1', CD.Package)
				.in('p2', 'model2', CD.Package).filter { p1.name == p2.name }
				.out('new_p', 'out', CD.Package, {
					new_p.name = p1.name
					
					def new_c_list = fetch(['c1': p1.classifiers, 'c2': p2.classifiers])
					new_p.classifiers.addAll(new_c_list)
				}),

			rule('MatchDataType')
				.in('c1', 'model1', CD.DataType)
				.in('c2', 'model2', CD.DataType).filter { c1.name == c2.name }
				.out('new_d', 'out', CD.DataType, {
					new_d.name = c1.name
				}),

			rule('MatchClass')
				.in('c1', 'model1', CD.Class)
				.in('c2', 'model2', CD.Class).filter { c1.name == c2.name }
				.out('new_c', 'out', CD.Class, {
					new_c.name = c1.name
					def new_a_list = fetch(['a1': c1.attr, 'a2': c2.attr])
					new_c.attr.addAll(new_a_list)
				}),
			
			rule('MatchAttribute')
				.in('a1', 'model1', CD.Attribute)
				.in('a2', 'model2', CD.Attribute).filter { 
					a1.owner.name == a2.owner.name && a1.name == a2.name }
				.out('new_a', 'out', CD.Attribute, {
					new_a.name = a1.name
				})
		])
	}
	
}
