package cd2db

import CD.Attribute
import CD.CDPackage
import CD.Class
import CD.Classifier
import CD.DataType
import Relational.Column
import Relational.RelationalPackage
import Relational.Table
import java.util.List
import java.util.Map
import yamtl.core.YAMTLModule

import static yamtl.dsl.Helper.*
import static yamtl.dsl.Rule.*

class cd2db_attribute_helper extends YAMTLModule {
	val CD = CDPackage.eINSTANCE  
	val DB = RelationalPackage.eINSTANCE  
	new () {
		header().in('cd', CD).out('db', DB)
		
		ruleStore( newArrayList(
			rule('ClassToTable')
				.in('c', CD.class_)
				.out('t', DB.table, [
					val classToIncomingReferences = 
						'classToIncomingReferences'.fetch(#{}) 
						as Map<Class,List<Attribute>> 
					t.name = c.name
					t.col += c.attr.fetch as List<Column>
					t.col += pk_col
					val list = classToIncomingReferences.get(c).fetch('fk_col','ReferenceToFkColumn') as List<Column>
					if (list !== null)
						t.col += list
				])
				.out('pk_col', DB.column, [
					pk_col.name = 'pk_' + c.name 
				])
				,
		
			rule('AttributeToColumn')
				.in('att', CD.attribute).filter([
					att.type instanceof DataType
				])
				.out('col', DB.column, [ 
					col.name = att.name
				]),
		
			rule('ReferenceToFkColumn')
				.uniqueLazy
				.in('ref', CD.attribute)
				.out('fk_col', DB.column, [ 
					fk_col.name = 
						'''fk_«ref.type.name»--«ref.name»-->«(ref.owner as Class).name»'''
				])
				
		))
		
		helperStore( newArrayList(
			staticOperation('classToIncomingReferences') [
				val classToIncomingReferences = newLinkedHashMap()
				CD.attribute.allInstances.map[it as Attribute].filter[
					type instanceof Class && multiValued						
				].forEach[
					val refList = classToIncomingReferences.get(type)
					if (refList === null)
						classToIncomingReferences.put(type, newArrayList(it))
					else
						refList.add(it)
				]
				classToIncomingReferences
			]
		))
	}
	
	def c() {
	  'c'.fetch() as Class
	}
	def t() {
	  't'.fetch() as Table
	}
	def pk_col() {
	  'pk_col'.fetch() as Column
	}
	def att() {
	  'att'.fetch() as Attribute
	}
	def col() {
	  'col'.fetch() as Column
	}
	def ref() {
	  'ref'.fetch() as Attribute
	}
	def fk_col() {
	  'fk_col'.fetch() as Column
	}
		
}


//			rule('DataTypeToType')
//				.in('dt', CD.dataType)
//				.out('t', DB.type, [ 
//					val dt = 'dt'.fetch as DataType
//					val t = 't'.fetch as Type
//					
//					t.name = dt.name
//					
//				])
//				
				
//		helperStore( newArrayList(
//			new Helper('string') [
//					CD.dataType.allInstances.map[it as DataType].findFirst[ 
//						name == 'String'
//					]
//				]
//				
//		))
		
