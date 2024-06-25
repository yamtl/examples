package cd2db;

import static yamtl.dsl.Helper.*;
import static yamtl.dsl.Rule.*;

import org.eclipse.emf.ecore.EPackage;

import yamtl.core.YAMTLModuleGroovy
import yamtl.groovy.YAMTLGroovyExtensions_dynamicEMF

// transformation
public class CD2DB_dynamic_annotated extends YAMTLModuleGroovy {
    // transformation
    CD2DB_dynamic_annotated(EPackage CD, EPackage DB) {

		// transformation
        header().in('cd', CD).out('db', DB)

		ruleStore([
			rule('ClassToTable')
				// model_navigation
				.in('c', CD.Class)
				// transformation
				.out('t', DB.Table, {
					t.name = c.name ?: ''
					t.col += key
					t.key += key
					// model_navigation
					def list = c.attr.findAll{ !it.multiValued }
					
					// transformation
					t.col += 
						// tracing
						fetch(list, 'col')
				})
				// transformation
				.out('key', DB.Column, {
					def key=key
					key.name = 'objectId'
					key.type = fetch(objectIdType)
				}),
			// transformation
			rule('DataType2Type')
				// model_navigation
				.in('dt', CD.DataType)
				// transformation
				.out('type', DB.Type, {
					type.name = dt.name
				}),
			// transformation
			rule('DataTypeAttribute2Column')
				// model_navigation
				.in('att', CD.Attribute).filter({
					CD.DataType.isInstance(att.type) && !att.multiValued
				})
				// transformation
				.out('col', DB.Column, {
					col.name = att.name
					col.type = 
						// tracing
						fetch(att.type)
				}),
			// transformation
			rule('MultiValuedDataTypeAttribute2Column')
				// model_navigation
				.in('att', CD.Attribute).filter({
					CD.DataType.isInstance(att.type) && att.multiValued
				})
				// transformation
				.out('t', DB.Table, {
					t.name = "${att.owner?.name?:''}_${att.name?:''}"
					t.col += id
					t.col += col
				})
				.out('id', DB.Column, {
					id.name = "${att.owner?.name?.toLowerCase()?:''}Id"
					id.type = 
						// tracing
						fetch(objectIdType)
				})
				// transformation
				.out('col', DB.Column, {
					col.name = att.name
					col.type = 
						// tracing
						fetch(att.type)
				}),
			// transformation
			rule('ClassAttribute2Column')
				// model_navigation
				.in('att', CD.Attribute).filter({
					CD.Class.isInstance(att.type) && !att.multiValued
				})
				// transformation
				.out('col', DB.Column, {
					col.name = "${att.name}Id"
					col.type = 
						// tracing
						fetch(objectIdType)
				}),
			// transformation
			rule('MultiValuedClassAttribute2Column')
				// model_navigation
				.in('att', CD.Attribute).filter({
					CD.Class.isInstance(att.type) && att.multiValued
				})
				// transformation
				.out('t', DB.Table, {
					t.name = "${att.owner?.name?:''}_${att.name}"
					t.col += id
					t.col += col
				})
				.out('id', DB.Column, {
					id.name = "${att.owner?.name?.toLowerCase()?:''}Id"						
					id.type = 
						// tracing
						fetch(objectIdType)
				})
				// transformation
				.out('col', DB.Column, {
					col.name = "${att.name}Id"
					col.type = 
						// tracing 
						fetch(objectIdType)
				})
		])
		// helper
        helperStore([
            staticAttribute('objectIdType', {
                allInstances(CD.DataType).find{ it.name == 'Integer' }
            })
        ])
    }

}
