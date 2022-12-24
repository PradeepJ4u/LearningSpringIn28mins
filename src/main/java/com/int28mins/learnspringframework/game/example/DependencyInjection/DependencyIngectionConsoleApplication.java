package com.int28mins.learnspringframework.game.example.DependencyInjection;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class DependencyIngectionConsoleApplication {

	@Component
	class YourBussinessClass {

		Dependency1 dependency1;

		Dependency2 dependency2;
		
		/*
		 * @Autowired public void setDependency1(Dependency1 dependency1) {
		 * System.out.println("Setter Dependency Injection dependency1");
		 * this.dependency1 = dependency1; }
		 * 
		 * @Autowired public void setDependency2(Dependency2 dependency2) {
		 * System.out.println("Setter Dependency Injection dependency2");
		 * this.dependency2 = dependency2; }
		 */
		
		public String toString() {
			return "YourBussinessClass " + dependency1 + " and " + dependency2;
		}
        //@Autowired
		public YourBussinessClass(Dependency1 dependency1, Dependency2 dependency2) {        	
			super();
			System.out.println("Dependency Injection constructor");
			this.dependency1 = dependency1;
			this.dependency2 = dependency2;
		}
	}

	@Component
	class Dependency1 {

	}

	@Component
	class Dependency2 {

	}
	public static void main(String[] args) {

		try(var context = new AnnotationConfigApplicationContext(DependencyIngectionConsoleApplication.class)){
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

			System.out.println(context.getBean(YourBussinessClass.class).toString());
		}
	}
}