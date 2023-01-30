package com.organization.mvcproject.model;

import org.springframework.stereotype.Component;

@Component
public class Game {
	//changes were superficial
	private Long id;
	private String name;
	private String genre;

	public Long getId() {
		return id;
	}

	public void setId(Long game_id) {
		this.id = game_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String game_name) {
		this.name = game_name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String game_genre) {
		this.genre = game_genre;
	}

}
