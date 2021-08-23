package guru.springframework.spring5webapp.diWithAndWihoutSpring.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class GreetingServiceImpl implements GreetingService {
	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello NK - from the Primary Bean";
	}

}
