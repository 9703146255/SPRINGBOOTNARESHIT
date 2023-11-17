package in.thiru.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController 
{
	
	
	
    @GetMapping(value="/welcome")
	public String getWelcomeMsg()
	{
		return "welcome to thiru technologies..";
	}
	
	
}
