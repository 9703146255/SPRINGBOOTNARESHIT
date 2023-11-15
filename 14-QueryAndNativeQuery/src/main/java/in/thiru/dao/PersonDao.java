package in.thiru.dao;

import java.util.Date;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
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
	
	
	/*
	 CrudRepository				: framework provide abstract methods and also implementation
	 
	 Derived method or query	: Developer needs to write abstract methods and implementation provided by framework
	 
	 Named Query                : Developer should write abstract methods and also implementation is provided by developer only
	
	 we don't follow naming format here like derived methods
	 */
	
	public List<Person> giveDataByLastName(String lastName);
	
	public List<Person> giveDetails(String lastName,String firstName);
	
	
	//Query and native-query	
	//both declaration and implementation we will write in the DAO layer itself
	
	
	//Query -> We are going to write JPQL -> Writing Java Classes and Java proprties
	@Query(value="SELECT p FROM Person p where p.firstName=?1 OR p.email=?2") //Implementation
	List<Person> findPersonInfobyFirstNameorEmail(String firstName,String email); //Abtract Method

	//NativeQuery -> We are going to write SQL -> Writing database tables and database columns
	@Query(value="SELECT * FROM table_person p where p.first_name=?1",nativeQuery = true)
	List<Person> findPersonINfobyFirstname(String firstName);
	

	
	
	
	
	
	
	
	
	
	
	
	
}
