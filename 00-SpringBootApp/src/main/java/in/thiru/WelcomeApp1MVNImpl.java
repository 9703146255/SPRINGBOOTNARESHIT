package in.thiru;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeApp1MVNImpl {
	
	@RequestMapping(value="/")
	public String getMessage()
	{
		return "Welcome to Springboot application 00-SpringBootApp";
	}

}
