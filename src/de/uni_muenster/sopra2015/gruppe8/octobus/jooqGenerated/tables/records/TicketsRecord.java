/**
 * This class is generated by jOOQ
 */
package de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.3"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TicketsRecord extends org.jooq.impl.UpdatableRecordImpl<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.TicketsRecord> implements org.jooq.Record5<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String> {

	private static final long serialVersionUID = -1094430846;

	/**
	 * Setter for <code>tickets.tickets_id</code>.
	 */
	public void setTicketsId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>tickets.tickets_id</code>.
	 */
	public java.lang.Integer getTicketsId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>tickets.name</code>.
	 */
	public void setName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>tickets.name</code>.
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>tickets.price</code>.
	 */
	public void setPrice(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>tickets.price</code>.
	 */
	public java.lang.Integer getPrice() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>tickets.numPassengers</code>.
	 */
	public void setNumpassengers(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>tickets.numPassengers</code>.
	 */
	public java.lang.Integer getNumpassengers() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>tickets.description</code>.
	 */
	public void setDescription(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>tickets.description</code>.
	 */
	public java.lang.String getDescription() {
		return (java.lang.String) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String> fieldsRow() {
		return (org.jooq.Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String> valuesRow() {
		return (org.jooq.Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Tickets.TICKETS.TICKETS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Tickets.TICKETS.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Tickets.TICKETS.PRICE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Tickets.TICKETS.NUMPASSENGERS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Tickets.TICKETS.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getTicketsId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getPrice();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getNumpassengers();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TicketsRecord value1(java.lang.Integer value) {
		setTicketsId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TicketsRecord value2(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TicketsRecord value3(java.lang.Integer value) {
		setPrice(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TicketsRecord value4(java.lang.Integer value) {
		setNumpassengers(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TicketsRecord value5(java.lang.String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TicketsRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.Integer value3, java.lang.Integer value4, java.lang.String value5) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TicketsRecord
	 */
	public TicketsRecord() {
		super(de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Tickets.TICKETS);
	}

	/**
	 * Create a detached, initialised TicketsRecord
	 */
	public TicketsRecord(java.lang.Integer ticketsId, java.lang.String name, java.lang.Integer price, java.lang.Integer numpassengers, java.lang.String description) {
		super(de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Tickets.TICKETS);

		setValue(0, ticketsId);
		setValue(1, name);
		setValue(2, price);
		setValue(3, numpassengers);
		setValue(4, description);
	}
}