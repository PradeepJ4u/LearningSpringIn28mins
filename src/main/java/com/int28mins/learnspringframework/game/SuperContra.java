package com.int28mins.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class SuperContra implements GamingConsole{
	public void upButtonClick() {
		System.out.println("SuperMario Game: up Button clicked");
	}
	public void downButtonClick() {
		System.out.println("SuperMario Game: Down Button clicked");
	}
	public void leftButtonClick() {
		System.out.println("SuperMario Game: Left Button clicked");
	}
	public void rightButtonClick() {
		System.out.println("SuperMario Game: Right Button clicked");
	}
}
