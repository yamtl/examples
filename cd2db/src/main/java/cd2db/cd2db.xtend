package cd2db

import CD.Attribute
import CD.CDPackage
import CD.Class
import CD.DataType
import Relational.Column
import Relational.RelationalPackage
import Relational.Table
import java.util.List
import yamtl.core.YAMTLModule
import yamtl.dsl.Rule

class cd2db extends YAMTLModule {
	val CD = CDPackage.eINSTANCE  
	val DB = RelationalPackage.eINSTANCE  
	new () {
		header().in('cd', CD).out('db', DB)
		
		ruleStore( newArrayList(
			new Rule('ClassToTable')
				.in('c', CD.class_).build()
				.out('t', DB.table, [
					// environment vbles 
					val c = 'c'.fetch as Class
					val t = 't'.fetch as Table
					val pk_col = 'pk_col'.fetch as Column
					// bindings
					t.name = c.name
					t.col += c.attr.fetch as List<Column>
					t.col += pk_col
					val list = c.incomingReferences
						.fetch('ReferenceToFkColumn') 
						as List<Column>
					if (list !== null)
						t.col += list
				]).build()
				.out('pk_col', DB.column, [
					// environment vbles 
					val c = 'c'.fetch as Class
					val pk_col = 'pk_col'.fetch as Column
					// bindings
					pk_col.name = 'pk_' + c.name 
				]).build()
				.build(),
		
			new Rule('AttributeToColumn')
				.in('att', CD.attribute).filter([
					val att = 'att'.fetch as Attribute
					att.type instanceof DataType
				]).build()
				.out('col', DB.column, [ 
					val att = 'att'.fetch as Attribute
					val col = 'col'.fetch as Column
					col.name = att.name
				]).build()
				.build(),
		
			new Rule('ReferenceToFkColumn')
				.uniqueLazy
				.in('ref', CD.attribute).build()
				.out('fk_col', DB.column, [ 
					val ref = 'ref'.fetch as Attribute
					val fk_col = 'fk_col'.fetch as Column
					fk_col.name = 
						'''fk_«ref.type.name»--«ref.name»-->«
						(ref.eContainer as Class).name»'''
				]).build()
				.build()
		))
	}
	
	def incomingReferences(Class c) {
		CD.attribute.allInstances
		.map[it as Attribute].filter[type==c && multiValued]
	}
}


//			new Rule('DataTypeToType')
//				.in('dt', CD.dataType).build()
//				.out('t', DB.type, [ 
//					val dt = 'dt'.fetch as DataType
//					val t = 't'.fetch as Type
//					
//					t.name = dt.name
//					
//				]).build()
//				.build()
				
//		helperStore( newArrayList(
//			new Helper('string') [
//					CD.dataType.allInstances.map[it as DataType].findFirst[ 
//						name == 'String'
//					]
//				]
//				.build()
//		))
		
