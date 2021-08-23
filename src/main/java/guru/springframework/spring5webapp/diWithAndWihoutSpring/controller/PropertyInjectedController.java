package guru.springframework.spring5webapp.diWithAndWihoutSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.spring5webapp.diWithAndWihoutSpring.services.GreetingService;

//Property Based DI without spring (Dependency Injected in J-unit Test)
//Property Based DI with spring using Annotation (DI by IOC in Spring5webappApplication using context)
@Controller
public class PropertyInjectedController {
	@Qualifier("propertyGreetingServiceImpl")
	@Autowired
	public GreetingService greetingService;

	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
