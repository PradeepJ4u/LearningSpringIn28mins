package com.int28mins.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public interface GamingConsole {
	void upButtonClick(); 
	void downButtonClick();
	void leftButtonClick();
	void rightButtonClick();
}
