package com.int28mins.learnspringframework.game.example.e1.PrePostConstruct;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass{
	SomeDependencies someDependency;

	public SomeClass(SomeDependencies someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("Dependencies Loaded");
	}

	@PostConstruct
	private void initialize() {
		someDependency.getReady();
	}	
	
	@PreDestroy	
	private void cleanup() {
		System.out.println("Cleaningup the code PreDestoy.");
	}
}

@Component
class SomeDependencies {

	public void getReady() {
		System.out.println("getReady, Initialize logic");

	}

}

@Configuration
@ComponentScan
public class PrePostConstructApplication {

	public static void main(String[] args) {

		try(var context = new AnnotationConfigApplicationContext(PrePostConstructApplication.class)){
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
	}
}