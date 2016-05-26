/**
 * This class is generated by jOOQ
 */
package org.wch.jooq.entity.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;
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
import org.wch.jooq.entity.tables.records.TAccountRecord;


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
public class TAccount extends TableImpl<TAccountRecord> {

	private static final long serialVersionUID = -1470315488;

	/**
	 * The reference instance of <code>optimus.t_account</code>
	 */
	public static final TAccount T_ACCOUNT = new TAccount();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TAccountRecord> getRecordType() {
		return TAccountRecord.class;
	}

	/**
	 * The column <code>optimus.t_account.account_id</code>. 账号id
	 */
	public final TableField<TAccountRecord, String> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaulted(true), this, "账号id");

	/**
	 * The column <code>optimus.t_account.account_name</code>. 名称
	 */
	public final TableField<TAccountRecord, String> ACCOUNT_NAME = createField("account_name", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "名称");

	/**
	 * The column <code>optimus.t_account.account_title_no</code>. 账户科目号
	 */
	public final TableField<TAccountRecord, String> ACCOUNT_TITLE_NO = createField("account_title_no", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "账户科目号");

	/**
	 * The column <code>optimus.t_account.balance</code>. 余额
	 */
	public final TableField<TAccountRecord, BigDecimal> BALANCE = createField("balance", org.jooq.impl.SQLDataType.DECIMAL.precision(15, 2).defaulted(true), this, "余额");

	/**
	 * The column <code>optimus.t_account.debitBalance</code>. 借方余额
	 */
	public final TableField<TAccountRecord, BigDecimal> DEBITBALANCE = createField("debitBalance", org.jooq.impl.SQLDataType.DECIMAL.precision(15, 2).defaulted(true), this, "借方余额");

	/**
	 * The column <code>optimus.t_account.creditBalance</code>. 贷方余额
	 */
	public final TableField<TAccountRecord, BigDecimal> CREDITBALANCE = createField("creditBalance", org.jooq.impl.SQLDataType.DECIMAL.precision(15, 2).defaulted(true), this, "贷方余额");

	/**
	 * The column <code>optimus.t_account.balance_direction</code>. D：借方  C：贷方
	 */
	public final TableField<TAccountRecord, String> BALANCE_DIRECTION = createField("balance_direction", org.jooq.impl.SQLDataType.CHAR.length(1), this, "D：借方  C：贷方");

	/**
	 * The column <code>optimus.t_account.frozen_balance</code>. 冻结余额
	 */
	public final TableField<TAccountRecord, BigDecimal> FROZEN_BALANCE = createField("frozen_balance", org.jooq.impl.SQLDataType.DECIMAL.precision(15, 2).defaulted(true), this, "冻结余额");

	/**
	 * The column <code>optimus.t_account.create_time</code>.
	 */
	public final TableField<TAccountRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>optimus.t_account.update_time</code>.
	 */
	public final TableField<TAccountRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.defaulted(true), this, "");

	/**
	 * Create a <code>optimus.t_account</code> table reference
	 */
	public TAccount() {
		this("t_account", null);
	}

	/**
	 * Create an aliased <code>optimus.t_account</code> table reference
	 */
	public TAccount(String alias) {
		this(alias, T_ACCOUNT);
	}

	private TAccount(String alias, Table<TAccountRecord> aliased) {
		this(alias, aliased, null);
	}

	private TAccount(String alias, Table<TAccountRecord> aliased, Field<?>[] parameters) {
		super(alias, Optimus.OPTIMUS, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<TAccountRecord> getPrimaryKey() {
		return Keys.KEY_T_ACCOUNT_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<TAccountRecord>> getKeys() {
		return Arrays.<UniqueKey<TAccountRecord>>asList(Keys.KEY_T_ACCOUNT_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TAccount as(String alias) {
		return new TAccount(alias, this);
	}

	/**
	 * Rename this table
	 */
	public TAccount rename(String name) {
		return new TAccount(name, null);
	}
}
