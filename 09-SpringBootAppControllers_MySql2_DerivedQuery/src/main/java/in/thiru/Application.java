package in.thiru;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.thiru.model.Ticket;
import in.thiru.service.TicketService;

@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	private TicketService ticketService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
	     Ticket tktObj=new Ticket();
	     tktObj.setPassengerName("CHANDU");
	     tktObj.setEmailId("CHANDU@gmail.com");
	     tktObj.setSourceStation("hyderabad");
	     tktObj.setDestStation("kurnool");
	     tktObj.setDateOfJourney(new Date());
	     
	     ticketService.createTicket(tktObj);
		
		
	}

}
