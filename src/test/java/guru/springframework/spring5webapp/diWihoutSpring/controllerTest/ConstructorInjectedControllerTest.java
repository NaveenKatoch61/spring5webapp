package guru.springframework.spring5webapp.diWihoutSpring.controllerTest;

import org.junit.Before;
import org.junit.Test;

import guru.springframework.spring5webapp.diWithAndWihoutSpring.controller.ConstructorInjectedController;
import guru.springframework.spring5webapp.diWithAndWihoutSpring.services.GreetingServiceImpl;

public class ConstructorInjectedControllerTest {

	ConstructorInjectedController controller;

	@Before
	public void setUp() {
		controller = new ConstructorInjectedController(new GreetingServiceImpl());

	}

	@Test
	public void getGreeting() {
		System.out.println(controller.getGreeting());
	}

}
