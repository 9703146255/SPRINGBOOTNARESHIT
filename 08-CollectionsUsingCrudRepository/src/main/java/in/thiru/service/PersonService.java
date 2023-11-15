package in.thiru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.thiru.dao.PersonDao;
import in.thiru.model.Person;

@Service
public class PersonService {
	
	
	@Autowired
	private PersonDao personDao;
	
	
	public Iterable<Person> saveAllPersons(Iterable<Person> personList)
	{
		return personDao.saveAll(personList);
	}
	
	
	public Iterable<Person> findAllPersons(Iterable<Integer> personIds)
	{
		return personDao.findAllById(personIds);
	}

}
