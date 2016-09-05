package com.sakila.Entity;

import java.sql.Timestamp;

import com.hand.Entity.EntityWithID;

public class Actor extends EntityWithID {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6645135828670862941L;
	private String first_name;
	private String last_name;
	private Timestamp last_update;
	@Override
	public void setID(long ID) {
		this.ID=ID;
	}

	@Override
	public long getID() {
		// TODO Auto-generated method stub
		return this.ID;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Timestamp getLast_update() {
		return last_update;
	}

	public void setLast_update(Timestamp last_update) {
		this.last_update = last_update;
	}

	@Override
	public String toString() {
		return "Actor [ID=" + ID + ", first_name=" + first_name + ", last_name=" + last_name + ", last_update="
				+ last_update + "]";
	}

}
