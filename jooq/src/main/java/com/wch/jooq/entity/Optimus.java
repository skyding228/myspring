/**
 * This class is generated by jOOQ
 */
package com.wch.jooq.entity;


import com.wch.jooq.entity.tables.TAccount;
import com.wch.jooq.entity.tables.TChanView;
import com.wch.jooq.entity.tables.TDict;
import com.wch.jooq.entity.tables.TEntry;
import com.wch.jooq.entity.tables.TMember;
import com.wch.jooq.entity.tables.TOrder;
import com.wch.jooq.entity.tables.TPayment;
import com.wch.jooq.entity.tables.TSequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Optimus extends SchemaImpl {

	private static final long serialVersionUID = 19266716;

	/**
	 * The reference instance of <code>optimus</code>
	 */
	public static final Optimus OPTIMUS = new Optimus();

	/**
	 * No further instances allowed
	 */
	private Optimus() {
		super("optimus");
	}

	@Override
	public final List<Table<?>> getTables() {
		List result = new ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final List<Table<?>> getTables0() {
		return Arrays.<Table<?>>asList(
			TAccount.T_ACCOUNT,
			TChanView.T_CHAN_VIEW,
			TDict.T_DICT,
			TEntry.T_ENTRY,
			TMember.T_MEMBER,
			TOrder.T_ORDER,
			TPayment.T_PAYMENT,
			TSequence.T_SEQUENCE);
	}
}
