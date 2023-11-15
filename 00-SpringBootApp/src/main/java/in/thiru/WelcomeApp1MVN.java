package in.thiru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WelcomeApp1MVN {

	public static void main(String[] args) 
	{
	
		ConfigurableApplicationContext run = SpringApplication.run(WelcomeApp1MVN.class, args);
	}

}
