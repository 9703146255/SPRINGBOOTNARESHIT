package in.thiru.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {
	
	@GetMapping(value="/greet")
	public String getGreetMessage()
	{
		return "congratulations thiru you will get job soon....";
	}

}
