package linkedListReversal

import static yamtl.dsl.Rule.*

import org.eclipse.emf.ecore.EPackage

import yamtl.core.YAMTLModuleGroovy

class ReverseLinkedList extends YAMTLModuleGroovy {
	public ReverseLinkedList(EPackage inPk, EPackage outPk) {

/*
 * declares in, out, inOut parameters for a model transformation		
 */
header().in('in', inPk).out('out', outPk)

/*
 * rule declaration
 */
ruleStore([
	rule('LinkedList2LinkedList')
		.in('s', inPk.LinkedList)
		.out('t', outPk.LinkedList, {
			t.nodes = fetch(s.nodes)
			t.head = fetch(allInstances(inPk.Node).find{it.next==null})
		}),
	
	rule('Node2Node')
		.in('s', inPk.Node)
		.out('t', outPk.Node, {
			t.name = s.name
			t.next = fetch(allInstances(inPk.Node).find{it.next==s})
		})
])


	}
}
