package com.sakila.Entity;

import java.sql.Timestamp;

import com.hand.Entity.EntityWithID;

public class Country extends EntityWithID {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7761856509106749755L;
	private String country;
	private Timestamp last_update;

	@Override
	public void setID(long ID) {
		this.ID = ID;
	}

	@Override
	public long getID() {
		return this.ID;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Timestamp getLast_update() {
		return last_update;
	}

	public void setLast_update(Timestamp last_update) {
		this.last_update = last_update;
	}

	@Override
	public String toString() {
		return "Country [ID=" + ID + ", country=" + country + ", last_update=" + last_update + "]";
	}

}
