package guru.springframework.spring5webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.spring5webapp.diWithAndWihoutSpring.controller.ConstructorInjectedController;
import guru.springframework.spring5webapp.diWithAndWihoutSpring.controller.MyController;
import guru.springframework.spring5webapp.diWithAndWihoutSpring.controller.PropertyInjectedController;
import guru.springframework.spring5webapp.diWithAndWihoutSpring.controller.SetterInjectedController;

@SpringBootApplication
public class Spring5webappApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring5webappApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);
		
		System.out.println("-------------Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx
				.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());
		
		System.out.println("--------------Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController)ctx
				.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());
		
		System.out.println("--------------Cnstructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)ctx
				.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}
}
