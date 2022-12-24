package com.int28mins.learnspringframework.game.example.BussinessCalculationService;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class BussinessCalculationApplication{
	
	@Component
	public interface DataService {
		int[] retriveData();
	}
	
	@Component
	@Primary
	public class MongoDataService implements DataService{
		public int[] retriveData() {
			return new int[] {1,2,3,4,5}; 
		};
	}
	
	@Component
	@Qualifier
	public class MySQLService implements DataService{
		public int[] retriveData() {
			return new int[] {11,12,23,34,45}; 
		};
	}
	
	@Component
	public class BussnessCalculationService{
		DataService dataService;
			
		public BussnessCalculationService(DataService dataService) {
			super();
			System.out.println("*******" + dataService);
			this.dataService = dataService;
		}
		
		public int findMax() {
			return Arrays.stream(dataService.retriveData()).max().orElse(0); 
		};
	}
	
	public static void main(String[] args) {

		try(var context = new AnnotationConfigApplicationContext(BussinessCalculationApplication.class)){
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean(BussnessCalculationService.class).findMax());
		}
	}
}