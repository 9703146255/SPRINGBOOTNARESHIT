package in.thiru.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.thiru.model.Person;

@Repository
public interface PersonDao extends JpaRepository<Person, Integer>{

	public Iterable<Person> findByLastNameOrFirstName(String lastName,String firstName);

	
	public Person findByLastNameAndFirstName(String lastName,String firstName);
	
	
	public List<Person> findByLastNameOrderByCreatedDateDesc (String lastName);
	
	
	public List<Person> findByAgeLessThanEqual(Integer age);  
	
				
	public List<Person>  findByFirstNameLike(String firstName);
	
	
	
	public List<Person> findByLastNameAndAgeLessThanEqual(String lastName,int age);
	
	
	public List<Person> findByCreatedDateBetween(Date startDate,Date endDate);
	
	


}
