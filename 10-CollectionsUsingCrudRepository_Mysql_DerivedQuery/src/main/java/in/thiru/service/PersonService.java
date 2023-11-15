package in.thiru.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.thiru.dao.PersonDao;
import in.thiru.model.Person;

@Service
public class PersonService {
	
	
	@Autowired
	public PersonDao personDao;
	
	
	
	
	
	public Iterable<Person> findByLastNameOrFirstName(String lastName,String firstName)
	{
		return personDao.findByLastNameOrFirstName(lastName, firstName);
	}
	
	
	
	public Person findByLastNameAndFirstName(String lastName,String firstName)
	{
		return personDao.findByLastNameAndFirstName(lastName, firstName);
	}
	
	
	public List<Person> findByLastNameOrderByCreatedDateDesc(String lastName)
	{
		return personDao.findByLastNameOrderByCreatedDateDesc(lastName);
	}
	
	
	
	public List<Person> findByAgeLessThanEqual(Integer age)
	{
		return personDao.findByAgeLessThanEqual(age);
	}
	
	
	
	public List<Person>  findByFirstNameLike(String firstName)
	{
		return personDao.findByFirstNameLike(firstName);
	}
	
	
	public List<Person> findByLastNameAndAgeLessThanEqual(String lastName,int age)
	{
		return personDao.findByLastNameAndAgeLessThanEqual(lastName,age);
	}
	
	
	public List<Person> findByCreatedDateBetween(Date startDate,Date endDate)
	{
		return personDao.findByCreatedDateBetween(startDate, endDate);
	}
	
	
	
	
	
	public Iterable<Person> saveAllPersons(Iterable<Person> personList)
	{
		return personDao.saveAll(personList);
	}
	
	
	public Iterable<Person> findAllPersons(Iterable<Integer> personIds)
	{
		return personDao.findAllById(personIds);
	}

}
