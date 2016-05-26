/**
 * This class is generated by jOOQ
 */
package org.wch.jooq.entity.tables;


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
import org.wch.jooq.entity.tables.records.TMemberRecord;


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
public class TMember extends TableImpl<TMemberRecord> {

	private static final long serialVersionUID = 1277733469;

	/**
	 * The reference instance of <code>optimus.t_member</code>
	 */
	public static final TMember T_MEMBER = new TMember();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TMemberRecord> getRecordType() {
		return TMemberRecord.class;
	}

	/**
	 * The column <code>optimus.t_member.member_id</code>. 用户id  
	 */
	public final TableField<TMemberRecord, String> MEMBER_ID = createField("member_id", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaulted(true), this, "用户id  ");

	/**
	 * The column <code>optimus.t_member.chan_id</code>. 渠道id
	 */
	public final TableField<TMemberRecord, String> CHAN_ID = createField("chan_id", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "渠道id");

	/**
	 * The column <code>optimus.t_member.chan_user_id</code>. 渠道用户id
	 */
	public final TableField<TMemberRecord, String> CHAN_USER_ID = createField("chan_user_id", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "渠道用户id");

	/**
	 * The column <code>optimus.t_member.chan_user_name</code>. 渠道用户名
	 */
	public final TableField<TMemberRecord, String> CHAN_USER_NAME = createField("chan_user_name", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "渠道用户名");

	/**
	 * The column <code>optimus.t_member.mobile</code>. 手机号
	 */
	public final TableField<TMemberRecord, String> MOBILE = createField("mobile", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "手机号");

	/**
	 * The column <code>optimus.t_member.account_id</code>. 账户id
	 */
	public final TableField<TMemberRecord, String> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "账户id");

	/**
	 * The column <code>optimus.t_member.pay_passwd</code>. 支付密码
	 */
	public final TableField<TMemberRecord, String> PAY_PASSWD = createField("pay_passwd", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "支付密码");

	/**
	 * The column <code>optimus.t_member.create_time</code>. 创建时间
	 */
	public final TableField<TMemberRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "创建时间");

	/**
	 * The column <code>optimus.t_member.update_time</code>. 最后更新时间
	 */
	public final TableField<TMemberRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.defaulted(true), this, "最后更新时间");

	/**
	 * The column <code>optimus.t_member.status</code>. 状态  Normal：正常     Lock：密码错误锁定     Freeze：风控冻结 
	 */
	public final TableField<TMemberRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "状态  Normal：正常     Lock：密码错误锁定     Freeze：风控冻结 ");

	/**
	 * The column <code>optimus.t_member.lock_time</code>. 锁定时间
	 */
	public final TableField<TMemberRecord, Timestamp> LOCK_TIME = createField("lock_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "锁定时间");

	/**
	 * The column <code>optimus.t_member.type</code>. 类型 INVEST:投资账户,ADMIN:管理账户
	 */
	public final TableField<TMemberRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR.length(10).defaulted(true), this, "类型 INVEST:投资账户,ADMIN:管理账户");

	/**
	 * The column <code>optimus.t_member.chan_user_realname</code>. 渠道用户真实姓名
	 */
	public final TableField<TMemberRecord, String> CHAN_USER_REALNAME = createField("chan_user_realname", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "渠道用户真实姓名");

	/**
	 * The column <code>optimus.t_member.chan_user_id_number</code>. 渠道用户身份证编号
	 */
	public final TableField<TMemberRecord, String> CHAN_USER_ID_NUMBER = createField("chan_user_id_number", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "渠道用户身份证编号");

	/**
	 * Create a <code>optimus.t_member</code> table reference
	 */
	public TMember() {
		this("t_member", null);
	}

	/**
	 * Create an aliased <code>optimus.t_member</code> table reference
	 */
	public TMember(String alias) {
		this(alias, T_MEMBER);
	}

	private TMember(String alias, Table<TMemberRecord> aliased) {
		this(alias, aliased, null);
	}

	private TMember(String alias, Table<TMemberRecord> aliased, Field<?>[] parameters) {
		super(alias, Optimus.OPTIMUS, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<TMemberRecord> getPrimaryKey() {
		return Keys.KEY_T_MEMBER_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<TMemberRecord>> getKeys() {
		return Arrays.<UniqueKey<TMemberRecord>>asList(Keys.KEY_T_MEMBER_PRIMARY, Keys.KEY_T_MEMBER_CHAN_ID_CHAN_USER_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TMember as(String alias) {
		return new TMember(alias, this);
	}

	/**
	 * Rename this table
	 */
	public TMember rename(String name) {
		return new TMember(name, null);
	}
}
