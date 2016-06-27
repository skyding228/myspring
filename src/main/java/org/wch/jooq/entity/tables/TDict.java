/**
 * This class is generated by jOOQ
 */
package org.wch.jooq.entity.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.wch.jooq.entity.Keys;
import org.wch.jooq.entity.Optimus;
import org.wch.jooq.entity.tables.records.TDictRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TDict extends TableImpl<TDictRecord> {

	private static final long serialVersionUID = -1765128950;

	/**
	 * The reference instance of <code>optimus.t_dict</code>
	 */
	public static final TDict T_DICT = new TDict();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TDictRecord> getRecordType() {
		return TDictRecord.class;
	}

	/**
	 * The column <code>optimus.t_dict.id</code>. 键
	 */
	public final TableField<TDictRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "键");

	/**
	 * The column <code>optimus.t_dict.value</code>. 值
	 */
	public final TableField<TDictRecord, String> VALUE = createField("value", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "值");

	/**
	 * The column <code>optimus.t_dict.type</code>. 类型;CHAN:渠道,AUTH:授权信息
	 */
	public final TableField<TDictRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "类型;CHAN:渠道,AUTH:授权信息");

	/**
	 * The column <code>optimus.t_dict.description</code>. 描述信息
	 */
	public final TableField<TDictRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "描述信息");

	/**
	 * Create a <code>optimus.t_dict</code> table reference
	 */
	public TDict() {
		this("t_dict", null);
	}

	/**
	 * Create an aliased <code>optimus.t_dict</code> table reference
	 */
	public TDict(String alias) {
		this(alias, T_DICT);
	}

	private TDict(String alias, Table<TDictRecord> aliased) {
		this(alias, aliased, null);
	}

	private TDict(String alias, Table<TDictRecord> aliased, Field<?>[] parameters) {
		super(alias, Optimus.OPTIMUS, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<TDictRecord> getPrimaryKey() {
		return Keys.KEY_T_DICT_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<TDictRecord>> getKeys() {
		return Arrays.<UniqueKey<TDictRecord>>asList(Keys.KEY_T_DICT_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TDict as(String alias) {
		return new TDict(alias, this);
	}

	/**
	 * Rename this table
	 */
	public TDict rename(String name) {
		return new TDict(name, null);
	}
}