package com.int28mins.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class GamingConsoleApplication {

	public static void main(String[] args) {

		try(var context = new AnnotationConfigApplicationContext(GamingConsoleApplication.class)){

			context.getBean(GamingConsole.class).upButtonClick();
			context.getBean(GameRunner.class).run();
		}

	}

}
