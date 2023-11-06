package cd2db

import static yamtl.dsl.Rule.*
import static yamtl.dsl.Helper.*

import org.eclipse.emf.ecore.EPackage

import yamtl.core.YAMTLModule
import yamtl.groovy.YAMTLGroovyExtensions_dynamicEMF

class CD2DB extends YAMTLModule {
	public CD2DB(EPackage CD, EPackage DB) {
		YAMTLGroovyExtensions_dynamicEMF.init(this)
		
		header().in('cd', CD).out('db', DB)
			
		ruleStore( [
			
			rule('ClassToTable')
				.in('c', CD.Class)
				.out('t', DB.Table, {
					t.name = c.name
					t.col.add(pk_col)
					t.key.addAll( fetch(c.attr.findAll{a -> !a.multiValued }) )
				})
				.out('pk_col', DB.Column, {
					pk_col.name = 'objectId'
					pk_col.type = fetch(objectIdType)
				})
		
		])
		
		helperStore( [
			
			staticAttribute('objectIdType', {
				allInstances(CD.DataType).find{ CD.DataType.isInstance(it) && it.name == "Integer" }				
			})
			
		])
	}
	
}
