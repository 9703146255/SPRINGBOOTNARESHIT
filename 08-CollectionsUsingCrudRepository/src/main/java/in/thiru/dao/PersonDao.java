package in.thiru.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.thiru.model.Person;

@Repository
public interface PersonDao extends JpaRepository<Person, Integer>{

	

	
	
	//collections using crud repository
	//findAllById
	//SaveAll

}
