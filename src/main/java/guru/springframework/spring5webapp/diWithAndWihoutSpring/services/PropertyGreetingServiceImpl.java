package guru.springframework.spring5webapp.diWithAndWihoutSpring.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServiceImpl implements GreetingService{

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello NK - Property";
	}

}
