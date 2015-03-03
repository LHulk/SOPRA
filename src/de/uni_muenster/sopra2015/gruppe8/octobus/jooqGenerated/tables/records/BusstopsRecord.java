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
public class BusstopsRecord extends org.jooq.impl.UpdatableRecordImpl<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsRecord> implements org.jooq.Record5<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Boolean> {

	private static final long serialVersionUID = 646095653;

	/**
	 * Setter for <code>busStops.busStops_id</code>.
	 */
	public void setBusstopsId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>busStops.busStops_id</code>.
	 */
	public java.lang.Integer getBusstopsId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>busStops.name</code>.
	 */
	public void setName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>busStops.name</code>.
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>busStops.locationX</code>.
	 */
	public void setLocationx(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>busStops.locationX</code>.
	 */
	public java.lang.Integer getLocationx() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>busStops.locationY</code>.
	 */
	public void setLocationy(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>busStops.locationY</code>.
	 */
	public java.lang.Integer getLocationy() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>busStops.barrierFree</code>.
	 */
	public void setBarrierfree(java.lang.Boolean value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>busStops.barrierFree</code>.
	 */
	public java.lang.Boolean getBarrierfree() {
		return (java.lang.Boolean) getValue(4);
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
	public org.jooq.Row5<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Boolean> fieldsRow() {
		return (org.jooq.Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Boolean> valuesRow() {
		return (org.jooq.Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Busstops.BUSSTOPS.BUSSTOPS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Busstops.BUSSTOPS.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Busstops.BUSSTOPS.LOCATIONX;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Busstops.BUSSTOPS.LOCATIONY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field5() {
		return de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Busstops.BUSSTOPS.BARRIERFREE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getBusstopsId();
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
		return getLocationx();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getLocationy();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value5() {
		return getBarrierfree();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BusstopsRecord value1(java.lang.Integer value) {
		setBusstopsId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BusstopsRecord value2(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BusstopsRecord value3(java.lang.Integer value) {
		setLocationx(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BusstopsRecord value4(java.lang.Integer value) {
		setLocationy(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BusstopsRecord value5(java.lang.Boolean value) {
		setBarrierfree(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BusstopsRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.Integer value3, java.lang.Integer value4, java.lang.Boolean value5) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached BusstopsRecord
	 */
	public BusstopsRecord() {
		super(de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Busstops.BUSSTOPS);
	}

	/**
	 * Create a detached, initialised BusstopsRecord
	 */
	public BusstopsRecord(java.lang.Integer busstopsId, java.lang.String name, java.lang.Integer locationx, java.lang.Integer locationy, java.lang.Boolean barrierfree) {
		super(de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Busstops.BUSSTOPS);

		setValue(0, busstopsId);
		setValue(1, name);
		setValue(2, locationx);
		setValue(3, locationy);
		setValue(4, barrierfree);
	}
}