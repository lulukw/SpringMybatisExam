package com.sakila.Entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class Film_actor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6762199712762317378L;
	private int actor_id;
	private int film_id;
	private Timestamp last_update;

	public int getActor_id() {
		return actor_id;
	}

	public void setActor_id(int actor_id) {
		this.actor_id = actor_id;
	}

	public int getFilm_id() {
		return film_id;
	}

	public void setFilm_id(int film_id) {
		this.film_id = film_id;
	}

	public Timestamp getLast_update() {
		return last_update;
	}

	public void setLast_update(Timestamp last_update) {
		this.last_update = last_update;
	}

	@Override
	public String toString() {
		return "File_actor [actor_id=" + actor_id + ", film_id=" + film_id + ", last_update=" + last_update + "]";
	}

}
