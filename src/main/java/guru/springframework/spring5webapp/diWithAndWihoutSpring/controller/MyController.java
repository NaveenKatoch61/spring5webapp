package guru.springframework.spring5webapp.diWithAndWihoutSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.spring5webapp.diWithAndWihoutSpring.services.GreetingService;

@Controller
public class MyController {
	@Autowired
	private final GreetingService greetingService;
	
	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		System.out.println("Hello World!");
		return greetingService.sayGreeting();
		
		
	}
}
