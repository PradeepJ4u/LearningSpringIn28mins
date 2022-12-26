package com.int28mins.learnspringframework.game.example.g1.XMLConfiguration;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLConfigurationConsoleApplication {

	public static void main(String[] args) {
		
		try(var context = new ClassPathXmlApplicationContext("ContextConfigration.xml")){
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
		}
	}
}