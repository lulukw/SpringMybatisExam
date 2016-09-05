package com.sakila.Entity;

import java.io.Serializable;

public class Film_text implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3874523387931320188L;
	private int film_id;
	private String title;
	private String description;

	public int getFilm_id() {
		return film_id;
	}

	public void setFilm_id(int film_id) {
		this.film_id = film_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Film_text [film_id=" + film_id + ", title=" + title + ", description=" + description + "]";
	}

}
