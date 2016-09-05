package com.sakila.Entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.hand.Entity.EntityWithID;

public class Payment extends EntityWithID {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5709295273355317481L;
	private int customer_id;
	private int staff_id;
	private int rental_id;
	private BigDecimal amount;
	private Timestamp payment_data;
	private Timestamp last_update;

	@Override
	public void setID(long ID) {
		this.ID = ID;
	}

	@Override
	public long getID() {
		return this.ID;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public int getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(int staff_id) {
		this.staff_id = staff_id;
	}

	public int getRental_id() {
		return rental_id;
	}

	public void setRental_id(int rental_id) {
		this.rental_id = rental_id;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Timestamp getPayment_data() {
		return payment_data;
	}

	public void setPayment_data(Timestamp payment_data) {
		this.payment_data = payment_data;
	}

	public Timestamp getLast_update() {
		return last_update;
	}

	public void setLast_update(Timestamp last_update) {
		this.last_update = last_update;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Payment [ID=" + ID + ", customer_id=" + customer_id + ", staff_id=" + staff_id + ", rental_id="
				+ rental_id + ", amount=" + amount + ", payment_data=" + payment_data + ", last_update=" + last_update
				+ "]";
	}

}
