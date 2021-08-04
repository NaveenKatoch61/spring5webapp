package guru.springframework.spring5webapp.diWihoutSpring.controllerTest;

import org.junit.Before;
import org.junit.Test;

import guru.springframework.spring5webapp.diWithAndWihoutSpring.controller.SetterInjectedController;
import guru.springframework.spring5webapp.diWithAndWihoutSpring.services.GreetingServiceImpl;

public class SetterInjectedControllerTest {

	SetterInjectedController controller;

	@Before
	public void setUp() {
		controller = new SetterInjectedController();
		controller.setGreetingService(new GreetingServiceImpl());

	}

	@Test
	public void test() {
		System.out.println(controller.getGreeting());
	}

}
