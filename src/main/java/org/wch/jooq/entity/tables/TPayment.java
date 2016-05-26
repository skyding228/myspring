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
import org.wch.jooq.entity.tables.records.TPaymentRecord;


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
public class TPayment extends TableImpl<TPaymentRecord> {

	private static final long serialVersionUID = -1079669204;

	/**
	 * The reference instance of <code>optimus.t_payment</code>
	 */
	public static final TPayment T_PAYMENT = new TPayment();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TPaymentRecord> getRecordType() {
		return TPaymentRecord.class;
	}

	/**
	 * The column <code>optimus.t_payment.id</code>.
	 */
	public final TableField<TPaymentRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

	/**
	 * The column <code>optimus.t_payment.order_id</code>. 关联订单编号，确认是否已经进行了出入款
	 */
	public final TableField<TPaymentRecord, String> ORDER_ID = createField("order_id", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "关联订单编号，确认是否已经进行了出入款");

	/**
	 * The column <code>optimus.t_payment.subject_no</code>. 产品编号
	 */
	public final TableField<TPaymentRecord, String> SUBJECT_NO = createField("subject_no", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "产品编号");

	/**
	 * The column <code>optimus.t_payment.subject_name</code>. 产品名称
	 */
	public final TableField<TPaymentRecord, String> SUBJECT_NAME = createField("subject_name", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "产品名称");

	/**
	 * The column <code>optimus.t_payment.amount</code>. 金额
	 */
	public final TableField<TPaymentRecord, BigDecimal> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.DECIMAL.precision(15, 2).nullable(false), this, "金额");

	/**
	 * The column <code>optimus.t_payment.payment_type</code>. 出入款类型,PAYMENT_OUT:出款,PAYMENT_IN:入款
	 */
	public final TableField<TPaymentRecord, String> PAYMENT_TYPE = createField("payment_type", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "出入款类型,PAYMENT_OUT:出款,PAYMENT_IN:入款");

	/**
	 * The column <code>optimus.t_payment.action_type</code>. 操作类型,ACTION_LOAN:放款,ACTION_REPAYMENT:还款,ACTION_APPLY:申购,ACTION_REDEEM:赎回
	 */
	public final TableField<TPaymentRecord, String> ACTION_TYPE = createField("action_type", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "操作类型,ACTION_LOAN:放款,ACTION_REPAYMENT:还款,ACTION_APPLY:申购,ACTION_REDEEM:赎回");

	/**
	 * The column <code>optimus.t_payment.subject_type</code>. 产品类型,SUBJECT:定期产品,FUND:基金
	 */
	public final TableField<TPaymentRecord, String> SUBJECT_TYPE = createField("subject_type", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "产品类型,SUBJECT:定期产品,FUND:基金");

	/**
	 * The column <code>optimus.t_payment.create_time</code>. 创建时间
	 */
	public final TableField<TPaymentRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "创建时间");

	/**
	 * The column <code>optimus.t_payment.plat</code>. 所属平台编码
	 */
	public final TableField<TPaymentRecord, String> PLAT = createField("plat", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "所属平台编码");

	/**
	 * The column <code>optimus.t_payment.to_plat</code>. 渠道平台编码
	 */
	public final TableField<TPaymentRecord, String> TO_PLAT = createField("to_plat", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "渠道平台编码");

	/**
	 * Create a <code>optimus.t_payment</code> table reference
	 */
	public TPayment() {
		this("t_payment", null);
	}

	/**
	 * Create an aliased <code>optimus.t_payment</code> table reference
	 */
	public TPayment(String alias) {
		this(alias, T_PAYMENT);
	}

	private TPayment(String alias, Table<TPaymentRecord> aliased) {
		this(alias, aliased, null);
	}

	private TPayment(String alias, Table<TPaymentRecord> aliased, Field<?>[] parameters) {
		super(alias, Optimus.OPTIMUS, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<TPaymentRecord> getPrimaryKey() {
		return Keys.KEY_T_PAYMENT_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<TPaymentRecord>> getKeys() {
		return Arrays.<UniqueKey<TPaymentRecord>>asList(Keys.KEY_T_PAYMENT_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TPayment as(String alias) {
		return new TPayment(alias, this);
	}

	/**
	 * Rename this table
	 */
	public TPayment rename(String name) {
		return new TPayment(name, null);
	}
}
