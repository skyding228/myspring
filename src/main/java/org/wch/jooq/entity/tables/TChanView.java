/**
 * This class is generated by jOOQ
 */
package org.wch.jooq.entity.tables;


import java.math.BigDecimal;
import java.sql.Date;
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
import org.wch.jooq.entity.tables.records.TChanViewRecord;


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
public class TChanView extends TableImpl<TChanViewRecord> {

	private static final long serialVersionUID = 1578467694;

	/**
	 * The reference instance of <code>optimus.t_chan_view</code>
	 */
	public static final TChanView T_CHAN_VIEW = new TChanView();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TChanViewRecord> getRecordType() {
		return TChanViewRecord.class;
	}

	/**
	 * The column <code>optimus.t_chan_view.id</code>. 渠道编号.日期
	 */
	public final TableField<TChanViewRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "渠道编号.日期");

	/**
	 * The column <code>optimus.t_chan_view.chan_id</code>. 渠道编号
	 */
	public final TableField<TChanViewRecord, String> CHAN_ID = createField("chan_id", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "渠道编号");

	/**
	 * The column <code>optimus.t_chan_view.date</code>. 数据日期
	 */
	public final TableField<TChanViewRecord, Date> DATE = createField("date", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "数据日期");

	/**
	 * The column <code>optimus.t_chan_view.previous</code>. 前一日账户余额
	 */
	public final TableField<TChanViewRecord, BigDecimal> PREVIOUS = createField("previous", org.jooq.impl.SQLDataType.DECIMAL.precision(15, 2).nullable(false).defaulted(true), this, "前一日账户余额");

	/**
	 * The column <code>optimus.t_chan_view.deposit</code>. 充值
	 */
	public final TableField<TChanViewRecord, BigDecimal> DEPOSIT = createField("deposit", org.jooq.impl.SQLDataType.DECIMAL.precision(15, 2).nullable(false).defaulted(true), this, "充值");

	/**
	 * The column <code>optimus.t_chan_view.withdraw</code>. 提现
	 */
	public final TableField<TChanViewRecord, BigDecimal> WITHDRAW = createField("withdraw", org.jooq.impl.SQLDataType.DECIMAL.precision(15, 2).nullable(false).defaulted(true), this, "提现");

	/**
	 * The column <code>optimus.t_chan_view.invest</code>. 产品投资总金额
	 */
	public final TableField<TChanViewRecord, BigDecimal> INVEST = createField("invest", org.jooq.impl.SQLDataType.DECIMAL.precision(15, 2).nullable(false).defaulted(true), this, "产品投资总金额");

	/**
	 * The column <code>optimus.t_chan_view.principal</code>. 还款本金
	 */
	public final TableField<TChanViewRecord, BigDecimal> PRINCIPAL = createField("principal", org.jooq.impl.SQLDataType.DECIMAL.precision(15, 2).nullable(false).defaulted(true), this, "还款本金");

	/**
	 * The column <code>optimus.t_chan_view.interest</code>. 还款利息
	 */
	public final TableField<TChanViewRecord, BigDecimal> INTEREST = createField("interest", org.jooq.impl.SQLDataType.DECIMAL.precision(15, 2).nullable(false).defaulted(true), this, "还款利息");

	/**
	 * The column <code>optimus.t_chan_view.provision_invest</code>. 使用备付金投资
	 */
	public final TableField<TChanViewRecord, BigDecimal> PROVISION_INVEST = createField("provision_invest", org.jooq.impl.SQLDataType.DECIMAL.precision(15, 2).nullable(false).defaulted(true), this, "使用备付金投资");

	/**
	 * The column <code>optimus.t_chan_view.provision_principal</code>. 备付金还款本金
	 */
	public final TableField<TChanViewRecord, BigDecimal> PROVISION_PRINCIPAL = createField("provision_principal", org.jooq.impl.SQLDataType.DECIMAL.precision(15, 2).nullable(false).defaulted(true), this, "备付金还款本金");

	/**
	 * The column <code>optimus.t_chan_view.provision_interest</code>. 备付金还款利息
	 */
	public final TableField<TChanViewRecord, BigDecimal> PROVISION_INTEREST = createField("provision_interest", org.jooq.impl.SQLDataType.DECIMAL.precision(15, 2).nullable(false).defaulted(true), this, "备付金还款利息");

	/**
	 * The column <code>optimus.t_chan_view.balance</code>. 当日账户余额
	 */
	public final TableField<TChanViewRecord, BigDecimal> BALANCE = createField("balance", org.jooq.impl.SQLDataType.DECIMAL.precision(15, 2).nullable(false).defaulted(true), this, "当日账户余额");

	/**
	 * The column <code>optimus.t_chan_view.create_time</code>. 创建时间
	 */
	public final TableField<TChanViewRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "创建时间");

	/**
	 * Create a <code>optimus.t_chan_view</code> table reference
	 */
	public TChanView() {
		this("t_chan_view", null);
	}

	/**
	 * Create an aliased <code>optimus.t_chan_view</code> table reference
	 */
	public TChanView(String alias) {
		this(alias, T_CHAN_VIEW);
	}

	private TChanView(String alias, Table<TChanViewRecord> aliased) {
		this(alias, aliased, null);
	}

	private TChanView(String alias, Table<TChanViewRecord> aliased, Field<?>[] parameters) {
		super(alias, Optimus.OPTIMUS, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<TChanViewRecord> getPrimaryKey() {
		return Keys.KEY_T_CHAN_VIEW_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<TChanViewRecord>> getKeys() {
		return Arrays.<UniqueKey<TChanViewRecord>>asList(Keys.KEY_T_CHAN_VIEW_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TChanView as(String alias) {
		return new TChanView(alias, this);
	}

	/**
	 * Rename this table
	 */
	public TChanView rename(String name) {
		return new TChanView(name, null);
	}
}