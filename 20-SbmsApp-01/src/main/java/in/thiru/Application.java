package in.thiru;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.thiru.dao.AddressDao;
import in.thiru.dao.UserDao;
import in.thiru.model.Address;
import in.thiru.model.User;

@SpringBootApplication
public class Application {

 

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    
}
