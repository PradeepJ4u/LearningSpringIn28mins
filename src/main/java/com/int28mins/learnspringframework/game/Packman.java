package com.int28mins.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class Packman implements GamingConsole{

	public void upButtonClick() {
		System.out.println("Packman Game: up Button clicked");
	}
	public void downButtonClick() {
		System.out.println("Packman Game: Down Button clicked");
	}
	public void leftButtonClick() {
		System.out.println("Packman Game: Left Button clicked");
	}
	public void rightButtonClick() {
		System.out.println("Packman Game: Right Button clicked");
	}

}
