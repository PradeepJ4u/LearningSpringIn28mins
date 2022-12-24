package com.int28mins.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.int28mins.learnspringframework.game.GamingConsole;

@Component
public class GameRunner {
	GamingConsole game;

	public GameRunner(@Qualifier("superContra") GamingConsole game) {
		this.game = game;
	}

	public void run() {
		System.out.println("Running game: " + game);
		game.upButtonClick();
		game.downButtonClick();
		game.leftButtonClick();
		game.rightButtonClick();
	}
	
}
