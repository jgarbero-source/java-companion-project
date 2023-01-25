package com.organization.mvcproject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.organization.mvcproject.model.Game;

@Service
public class GameServiceImpl implements GameService {
	
	/**
	 * TODO 2.0 The class that interacts with persistent data is called a Data Access Object(DAO)
	 *  or a Repository class. The private static list is mocking our persistance of games.
	 *   
	 *  Move this list, and methods operating on this list to an appropriately named package and class.
	 */
	
	private static Long id = new Long(0);
	private static Long companyId = new Long(0);
	private static List<Game> games = new ArrayList<Game>();

	static {
		games = populateGames();
	}

	private static List<Game> populateGames() {

		Game game1 = new Game();
		game1.setId(++id);
		game1.setGenre("Sport");
		game1.setName("Rocket League");

		Game game2 = new Game();
		game2.setId(++id);
		game2.setGenre("Shooter");
		game2.setName("Halo 3");

		Game game3 = new Game();
		game3.setId(++id);
		game3.setGenre("MMORPG");
		game3.setName("Runescape");

		games.add(game1);
		games.add(game2);
		games.add(game3);

		return games;
	}

	@Override
	public List<Game> retrieveAllGames() {
		return games;
	}

	@Override
	public Game saveGame(Game game) {
		game.setId(++id);
		games.add(game);
		return game;
	}
}