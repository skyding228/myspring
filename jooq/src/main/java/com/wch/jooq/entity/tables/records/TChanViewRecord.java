/**
 * This class is generated by jOOQ
 */
package com.wch.jooq.entity.tables.records;


import com.wch.jooq.entity.tables.TChanView;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;


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
public class TChanViewRecord extends UpdatableRecordImpl<TChanViewRecord> implements Record14<String, String, Date, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, Timestamp> {

	private static final long serialVersionUID = -142988721;

	/**
	 * Setter for <code>optimus.t_chan_view.id</code>. 渠道编号.日期
	 */
	public void setId(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>optimus.t_chan_view.id</code>. 渠道编号.日期
	 */
	public String getId() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>optimus.t_chan_view.chan_id</code>. 渠道编号
	 */
	public void setChanId(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>optimus.t_chan_view.chan_id</code>. 渠道编号
	 */
	public String getChanId() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>optimus.t_chan_view.date</code>. 数据日期
	 */
	public void setDate(Date value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>optimus.t_chan_view.date</code>. 数据日期
	 */
	public Date getDate() {
		return (Date) getValue(2);
	}

	/**
	 * Setter for <code>optimus.t_chan_view.previous</code>. 前一日账户余额
	 */
	public void setPrevious(BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>optimus.t_chan_view.previous</code>. 前一日账户余额
	 */
	public BigDecimal getPrevious() {
		return (BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>optimus.t_chan_view.deposit</code>. 充值
	 */
	public void setDeposit(BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>optimus.t_chan_view.deposit</code>. 充值
	 */
	public BigDecimal getDeposit() {
		return (BigDecimal) getValue(4);
	}

	/**
	 * Setter for <code>optimus.t_chan_view.withdraw</code>. 提现
	 */
	public void setWithdraw(BigDecimal value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>optimus.t_chan_view.withdraw</code>. 提现
	 */
	public BigDecimal getWithdraw() {
		return (BigDecimal) getValue(5);
	}

	/**
	 * Setter for <code>optimus.t_chan_view.invest</code>. 产品投资总金额
	 */
	public void setInvest(BigDecimal value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>optimus.t_chan_view.invest</code>. 产品投资总金额
	 */
	public BigDecimal getInvest() {
		return (BigDecimal) getValue(6);
	}

	/**
	 * Setter for <code>optimus.t_chan_view.principal</code>. 还款本金
	 */
	public void setPrincipal(BigDecimal value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>optimus.t_chan_view.principal</code>. 还款本金
	 */
	public BigDecimal getPrincipal() {
		return (BigDecimal) getValue(7);
	}

	/**
	 * Setter for <code>optimus.t_chan_view.interest</code>. 还款利息
	 */
	public void setInterest(BigDecimal value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>optimus.t_chan_view.interest</code>. 还款利息
	 */
	public BigDecimal getInterest() {
		return (BigDecimal) getValue(8);
	}

	/**
	 * Setter for <code>optimus.t_chan_view.provision_invest</code>. 使用备付金投资
	 */
	public void setProvisionInvest(BigDecimal value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>optimus.t_chan_view.provision_invest</code>. 使用备付金投资
	 */
	public BigDecimal getProvisionInvest() {
		return (BigDecimal) getValue(9);
	}

	/**
	 * Setter for <code>optimus.t_chan_view.provision_principal</code>. 备付金还款本金
	 */
	public void setProvisionPrincipal(BigDecimal value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>optimus.t_chan_view.provision_principal</code>. 备付金还款本金
	 */
	public BigDecimal getProvisionPrincipal() {
		return (BigDecimal) getValue(10);
	}

	/**
	 * Setter for <code>optimus.t_chan_view.provision_interest</code>. 备付金还款利息
	 */
	public void setProvisionInterest(BigDecimal value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>optimus.t_chan_view.provision_interest</code>. 备付金还款利息
	 */
	public BigDecimal getProvisionInterest() {
		return (BigDecimal) getValue(11);
	}

	/**
	 * Setter for <code>optimus.t_chan_view.balance</code>. 当日账户余额
	 */
	public void setBalance(BigDecimal value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>optimus.t_chan_view.balance</code>. 当日账户余额
	 */
	public BigDecimal getBalance() {
		return (BigDecimal) getValue(12);
	}

	/**
	 * Setter for <code>optimus.t_chan_view.create_time</code>. 创建时间
	 */
	public void setCreateTime(Timestamp value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>optimus.t_chan_view.create_time</code>. 创建时间
	 */
	public Timestamp getCreateTime() {
		return (Timestamp) getValue(13);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<String> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record14 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row14<String, String, Date, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, Timestamp> fieldsRow() {
		return (Row14) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row14<String, String, Date, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, Timestamp> valuesRow() {
		return (Row14) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return TChanView.T_CHAN_VIEW.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return TChanView.T_CHAN_VIEW.CHAN_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field3() {
		return TChanView.T_CHAN_VIEW.DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field4() {
		return TChanView.T_CHAN_VIEW.PREVIOUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field5() {
		return TChanView.T_CHAN_VIEW.DEPOSIT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field6() {
		return TChanView.T_CHAN_VIEW.WITHDRAW;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field7() {
		return TChanView.T_CHAN_VIEW.INVEST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field8() {
		return TChanView.T_CHAN_VIEW.PRINCIPAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field9() {
		return TChanView.T_CHAN_VIEW.INTEREST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field10() {
		return TChanView.T_CHAN_VIEW.PROVISION_INVEST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field11() {
		return TChanView.T_CHAN_VIEW.PROVISION_PRINCIPAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field12() {
		return TChanView.T_CHAN_VIEW.PROVISION_INTEREST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field13() {
		return TChanView.T_CHAN_VIEW.BALANCE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field14() {
		return TChanView.T_CHAN_VIEW.CREATE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getChanId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value3() {
		return getDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value4() {
		return getPrevious();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value5() {
		return getDeposit();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value6() {
		return getWithdraw();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value7() {
		return getInvest();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value8() {
		return getPrincipal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value9() {
		return getInterest();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value10() {
		return getProvisionInvest();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value11() {
		return getProvisionPrincipal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value12() {
		return getProvisionInterest();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value13() {
		return getBalance();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value14() {
		return getCreateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TChanViewRecord value1(String value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TChanViewRecord value2(String value) {
		setChanId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TChanViewRecord value3(Date value) {
		setDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TChanViewRecord value4(BigDecimal value) {
		setPrevious(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TChanViewRecord value5(BigDecimal value) {
		setDeposit(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TChanViewRecord value6(BigDecimal value) {
		setWithdraw(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TChanViewRecord value7(BigDecimal value) {
		setInvest(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TChanViewRecord value8(BigDecimal value) {
		setPrincipal(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TChanViewRecord value9(BigDecimal value) {
		setInterest(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TChanViewRecord value10(BigDecimal value) {
		setProvisionInvest(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TChanViewRecord value11(BigDecimal value) {
		setProvisionPrincipal(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TChanViewRecord value12(BigDecimal value) {
		setProvisionInterest(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TChanViewRecord value13(BigDecimal value) {
		setBalance(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TChanViewRecord value14(Timestamp value) {
		setCreateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TChanViewRecord values(String value1, String value2, Date value3, BigDecimal value4, BigDecimal value5, BigDecimal value6, BigDecimal value7, BigDecimal value8, BigDecimal value9, BigDecimal value10, BigDecimal value11, BigDecimal value12, BigDecimal value13, Timestamp value14) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		value11(value11);
		value12(value12);
		value13(value13);
		value14(value14);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TChanViewRecord
	 */
	public TChanViewRecord() {
		super(TChanView.T_CHAN_VIEW);
	}

	/**
	 * Create a detached, initialised TChanViewRecord
	 */
	public TChanViewRecord(String id, String chanId, Date date, BigDecimal previous, BigDecimal deposit, BigDecimal withdraw, BigDecimal invest, BigDecimal principal, BigDecimal interest, BigDecimal provisionInvest, BigDecimal provisionPrincipal, BigDecimal provisionInterest, BigDecimal balance, Timestamp createTime) {
		super(TChanView.T_CHAN_VIEW);

		setValue(0, id);
		setValue(1, chanId);
		setValue(2, date);
		setValue(3, previous);
		setValue(4, deposit);
		setValue(5, withdraw);
		setValue(6, invest);
		setValue(7, principal);
		setValue(8, interest);
		setValue(9, provisionInvest);
		setValue(10, provisionPrincipal);
		setValue(11, provisionInterest);
		setValue(12, balance);
		setValue(13, createTime);
	}
}
