package guru.springframework.spring5webapp.diWihoutSpring.controllerTest;

import org.junit.Before;
import org.junit.Test;

import guru.springframework.spring5webapp.diWithAndWihoutSpring.controller.PropertyInjectedController;
import guru.springframework.spring5webapp.diWithAndWihoutSpring.services.ConstructorGreetingServiceImpl;

public class PropertyInjectedControllerTest {

	PropertyInjectedController controller;

	@Before
	public void setUp() {
		controller = new PropertyInjectedController();
		controller.greetingService = new ConstructorGreetingServiceImpl();

	}

	@Test
	public void getGreeting() {
		System.out.println(controller.getGreeting());
	}

}
