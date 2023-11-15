package in.thiru.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WelcomeMessage {
	
	
	@RequestMapping(value="/")
	public String getMessage()
	{
		return "Welcome to spring boot app 01-SpringBootApp";
	}

}
