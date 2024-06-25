package cd2db;

import static yamtl.dsl.Helper.*;
import static yamtl.dsl.Rule.*;

import org.eclipse.emf.ecore.EPackage;

import yamtl.core.YAMTLModuleGroovy

public class CD2DB_dynamic extends YAMTLModuleGroovy {
    CD2DB_dynamic(EPackage CD, EPackage DB) {

header().in('cd', CD).out('db', DB)

ruleStore([
	
	rule('ClassToTable')
		.in('c', CD.Class)
		.out('t', DB.Table, {
			t.name = c.name ?: ''
			t.col.add( key )
			t.key.add( key )
			def list = c.attr.findAll{ !it.multiValued }
			t.col.addAll( fetch(list, 'col') )
		})
		.out('key', DB.Column, {
			def key=key
			key.name = 'objectId'
			key.type = fetch(objectIdType)
		}),
	
	rule('DataType2Type')
		.in('dt', CD.DataType)
		.out('type', DB.Type, {
			type.name = dt.name
		}),
	
	rule('DataTypeAttribute2Column')
		.in('att', CD.Attribute).filter({
			CD.DataType.isInstance(att.type) && !att.multiValued
		})
		.out('col', DB.Column, {
			col.name = att.name
			col.type = fetch(att.type)
		}),
	
	rule('MultiValuedDataTypeAttribute2Column')
		.in('att', CD.Attribute).filter({
			CD.DataType.isInstance(att.type) && att.multiValued
		})
		.out('t', DB.Table, {
			t.name = "${att.owner?.name?:''}_${att.name?:''}"
			t.col.add( id )
			t.col.add( col )
		})
		.out('id', DB.Column, {
			id.name = "${att.owner?.name?.toLowerCase()?:''}Id"
			id.type = fetch(objectIdType)
		})
		.out('col', DB.Column, {
			col.name = att.name
			col.type = fetch(att.type)
		}),
	
	rule('ClassAttribute2Column')
		.in('att', CD.Attribute).filter({
			CD.Class.isInstance(att.type) && !att.multiValued
		})
		.out('col', DB.Column, {
			col.name = "${att.name}Id"
			col.type = fetch(objectIdType)
		}),

				rule('MultiValuedClassAttribute2Column')
		.in('att', CD.Attribute).filter({
			CD.Class.isInstance(att.type) && att.multiValued
		})
		.out('t', DB.Table, {
			t.name = "${att.owner?.name?:''}_${att.name}"
			t.col.add( id )
			t.col.add( col )
		})
		.out('id', DB.Column, {
			id.name = "${att.owner?.name?.toLowerCase()?:''}Id"						
			id.type = 
				fetch(objectIdType)
		})
		.out('col', DB.Column, {
			col.name = "${att.name}Id"
			col.type = fetch(objectIdType)
		})
])

helperStore([
    staticAttribute('objectIdType', {
        allInstances(CD.DataType).find{ it.name == 'Integer' }
    })
])

    }

}
