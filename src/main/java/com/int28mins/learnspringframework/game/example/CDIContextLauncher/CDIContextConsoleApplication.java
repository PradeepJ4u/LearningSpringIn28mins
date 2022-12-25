package com.int28mins.learnspringframework.game.example.CDIContextLauncher;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import jakarta.inject.Inject;
import jakarta.inject.Named;

//@Component
@Named
class BussinessLogic {
	DataService dataService;

	public DataService getDataService() {
		return dataService;
	}
	//@Autowired
	@Inject
	public void setDataService(DataService dataService) {
		this.dataService = dataService;
	}

	
}

//@Component
@Named
class DataService {

}

@Configuration
@ComponentScan
public class CDIContextConsoleApplication {

	public static void main(String[] args) {

		try(var context = new AnnotationConfigApplicationContext(CDIContextConsoleApplication.class)){
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean(BussinessLogic.class).getDataService());
		}
	}
}