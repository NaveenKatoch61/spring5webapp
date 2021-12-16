package guru.springframework.spring5webapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import guru.springframework.spring5webapp.diWithAndWihoutSpring.services.ConstructorGreetingServiceImpl;
import guru.springframework.spring5webapp.diWithAndWihoutSpring.services.GreetingServiceImpl;
import guru.springframework.spring5webapp.diWithAndWihoutSpring.services.PropertyGreetingServiceImpl;
import guru.springframework.spring5webapp.diWithAndWihoutSpring.services.SetterGreetingServiceImpl;

@Configuration
public class GreetingServiceConfig {
//Remove  @Service annotation from implemented service implementations

	@Primary
	@Bean
	GreetingServiceImpl greetingServiceImpl() {
		return new GreetingServiceImpl();
	}

	@Bean
	ConstructorGreetingServiceImpl constructorGreetingServiceImpl() {
		return new ConstructorGreetingServiceImpl();
	}

	@Bean
	PropertyGreetingServiceImpl propertyGreetingServiceImpl() {
		return new PropertyGreetingServiceImpl();
	}

	@Bean
	SetterGreetingServiceImpl setterGreetingServiceImpl() {
		return new SetterGreetingServiceImpl();
	}
}
