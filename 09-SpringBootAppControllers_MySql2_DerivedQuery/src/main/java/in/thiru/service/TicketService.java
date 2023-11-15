package in.thiru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.thiru.dao.TicketDao;
import in.thiru.model.Ticket;

@Service
public class TicketService {

	/*
	 * create object create ticket update ticket delete ticket retrieve all tickets
	 * Retrieve individual ticket Delete tickets
	 */

	@Autowired
	private TicketDao ticketDao;

	// retrieve all tickets
	public Iterable<Ticket> getAllTickets() {
		return ticketDao.findAll();
	}

	// Retrieve individual ticket
	public Ticket getTicket(Integer ticketId) {
//		Ticket orElse = ticketDao.findById(ticketId).orElse(new Ticket());
//		return orElse;
//		or
		return ticketDao.findById(ticketId).orElse(new Ticket());
	}
	
	
	//method overloading
	public Ticket getTicket(String passengerName)
	{
		return ticketDao.findByPassengerName(passengerName);
	}

	// create ticket
	public Ticket createTicket(Ticket ticketObj) {
		return ticketDao.save(ticketObj);

	}

	// update ticket
	public Ticket updateTicket(Integer ticketId, String newEmail) {
		Ticket ticketObj = getTicket(ticketId);
		ticketObj.setEmailId(newEmail);

		return ticketDao.save(ticketObj);
	}

	// Delete tickets
	public void deleteTicket(Integer ticketId) {
		ticketDao.deleteById(ticketId);
	}

}
