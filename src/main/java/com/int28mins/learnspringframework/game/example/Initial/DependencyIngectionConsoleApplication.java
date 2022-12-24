package com.int28mins.learnspringframework.game.example.Initial;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class DependencyIngectionConsoleApplication {

	public static void main(String[] args) {

		try(var context = new AnnotationConfigApplicationContext(DependencyIngectionConsoleApplication.class)){
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
	}
}