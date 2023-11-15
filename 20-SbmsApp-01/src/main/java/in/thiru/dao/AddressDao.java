package in.thiru.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import in.thiru.model.Address;

@Repository
public interface AddressDao extends CrudRepository<Address, Integer>{
	
	  
	   
	    
	    

}
