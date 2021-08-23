package guru.springframework.spring5webapp.diWithAndWihoutSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.spring5webapp.diWithAndWihoutSpring.services.GreetingService;

//Setter Based DI without spring (Dependency Injected in J-unit Test)
//Setter Based DI with spring using Annotation (DI by IOC in Spring5webappApplication using context)
@Controller
public class SetterInjectedController {
	@Qualifier("setterGreetingServiceImpl")
	@Autowired
	private GreetingService greetingService;

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
