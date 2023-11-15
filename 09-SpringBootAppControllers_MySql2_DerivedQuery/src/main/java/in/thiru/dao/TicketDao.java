package in.thiru.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.thiru.model.Ticket;

@Repository
public interface TicketDao extends CrudRepository<Ticket, Integer>{
	
	//Derived Queries
	//================
	//Abstract methods 	==>		developer should be taken care 
	//implementation 	==>		framework should be taken care
	
	public Ticket findByPassengerName(String passengerName);

}
