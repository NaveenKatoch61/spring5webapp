package guru.springframework.spring5webapp.diWithAndWihoutSpring.services;

import org.springframework.beans.factory.annotation.Qualifier;

//@Service
@Qualifier("c")
public class ConstructorGreetingServiceImpl implements GreetingService{
	
	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello NK - Constructor";
	}

}
