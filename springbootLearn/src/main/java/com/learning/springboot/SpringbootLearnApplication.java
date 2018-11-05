package com.learning.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootLearnApplication.class, args);
	}
	@RequestMapping(value="/hello" , method = RequestMethod.GET)
	public String	sayHello() {
		return "Hello From Amit!!!";
		
	}
}
