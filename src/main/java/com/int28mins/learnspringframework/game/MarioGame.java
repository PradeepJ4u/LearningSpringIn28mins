package com.int28mins.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole{
	public void upButtonClick() {
		System.out.println("Mario Game: up Button clicked");
	}
	public void downButtonClick() {
		System.out.println("Mario Game: Down Button clicked");
	}
	public void leftButtonClick() {
		System.out.println("Mario Game: Left Button clicked");
	}
	public void rightButtonClick() {
		System.out.println("Mario Game: Right Button clicked");
	}
}
