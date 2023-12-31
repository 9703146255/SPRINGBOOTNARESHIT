package in.thiru.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.thiru.model.Ticket;

@Repository
public interface TicketDao extends CrudRepository<Ticket, Integer>{

}
