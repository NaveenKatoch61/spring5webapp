package guru.springframework.spring5webapp.diWithAndWihoutSpring.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.spring5webapp.diWithAndWihoutSpring.services.GreetingService;

//Constructor Based DI without spring (Dependency Injected in J-unit Test)
//Constructor Based DI with spring using Annotation (DI by IOC in Spring5webappApplication using context)
@Controller
public class ConstructorInjectedController {
	
	private final GreetingService greetingService;

	public ConstructorInjectedController(@Qualifier("c") GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
