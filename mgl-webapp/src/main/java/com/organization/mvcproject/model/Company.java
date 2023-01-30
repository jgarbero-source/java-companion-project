
package com.organization.mvcproject.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

public class Company {

	private Long id;
	private String name;
	private List<Game> gamesMade;
//	= new ArrayList<Game>();

	public Long getCompanyId() {
		return id;
	}

	public void setCompanyId(Long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return name;
	}

	public void setCompanyName(String name) {
		this.name = name;
	}

	public List<Game> getGamesMade() {
		return gamesMade;
	}

	public void setGamesMade(List<Game> gamesMade) {
		this.gamesMade = gamesMade;
	}
}