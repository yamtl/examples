package linkedListReversal

import static yamtl.dsl.Rule.*

import org.eclipse.emf.ecore.EPackage

import yamtl.core.YAMTLModule
import yamtl.groovy.YAMTLGroovyExtensions_dynamicEMF

class ReverseLinkedList_inPlace extends YAMTLModule {
	public ReverseLinkedList_inPlace(EPackage pk) {
		YAMTLGroovyExtensions_dynamicEMF.init(this)

		header().inOut('model', pk)
		
		ruleStore([
			rule('LinkedList2LinkedList').priority(0)
				.in('list', pk.LinkedList)
				.out('list', pk.LinkedList, {
					list.head = allInstances(pk.Node).find{it.next==null}
				}),
			
			rule('Node2Node').priority(1)
				.in('node', pk.Node)
					.filter { node.next != null } 
				.out('node', pk.Node, {
					node.next.next = node
					node.next = null
				})
			
		])
	}
}
