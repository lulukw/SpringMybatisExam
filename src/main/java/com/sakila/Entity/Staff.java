package com.sakila.Entity;

import java.sql.Blob;
import java.sql.Timestamp;

import com.hand.Entity.EntityWithID;

public class Staff extends EntityWithID {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4827779053831317845L;
	private String first_name;
	private String last_name;
	private int address_id;
	private Blob picture;
	private String email;
	private int store_id;
	private boolean active;
	private String username;
	private String password;
	private Timestamp last_update;

	@Override
	public void setID(long ID) {
		this.ID = ID;
	}

	@Override
	public long getID() {
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

	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}

	public Blob getPicture() {
		return picture;
	}

	public void setPicture(Blob picture) {
		this.picture = picture;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getStore_id() {
		return store_id;
	}

	public void setStore_id(int store_id) {
		this.store_id = store_id;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Timestamp getLast_update() {
		return last_update;
	}

	public void setLast_update(Timestamp last_update) {
		this.last_update = last_update;
	}

	@Override
	public String toString() {
		return "Staff [ID=" + ID + ", first_name=" + first_name + ", last_name=" + last_name + ", address_id="
				+ address_id + ", picture=" + picture + ", email=" + email + ", store_id=" + store_id + ", active="
				+ active + ", username=" + username + ", password=" + password + ", last_update=" + last_update + "]";
	}

}
