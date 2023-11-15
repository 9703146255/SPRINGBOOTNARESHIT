package in.thiru;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.thiru.model.User;
import in.thiru.service.UserService;

@SpringBootApplication
public class Application implements CommandLineRunner{

	
	@Autowired
	private UserService userService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User user=new User();
		user.setUserName("thirumalesh");
		user.setEmail("findmethiru@gmail.com");
		user.setPhno((long) 970314625);
	    userService.createUser(user);
		
		
		
	}

}
