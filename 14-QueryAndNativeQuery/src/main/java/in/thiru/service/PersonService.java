package in.thiru.service;

import java.util.Date;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.thiru.dao.BookDao;
import in.thiru.dao.EmployeeDao;
import in.thiru.dao.PersonDao;
import in.thiru.model.Book;
import in.thiru.model.Employee;
import in.thiru.model.Person;

@Service
public class PersonService {
	
	@Autowired
	public EmployeeDao employeeDao;
	
	@Autowired
	public PersonDao personDao;
	
	
	@Autowired
	private BookDao bookDao;
	
	
	public List<Person> findPersonINfobyFirstname(String firstName)
	{
		return personDao.findPersonINfobyFirstname(firstName);
	}

	public List<Person> findPersonInfobyFirstNameorEmail(String firstName,String email)
	{
		return	personDao.findPersonInfobyFirstNameorEmail(firstName, email);
	}
	
	
	
	public Iterable<Object[]> giveMaxSalariesByDept(List<String> deptNames)
	{
		return employeeDao.giveMaxSalariesByDept(deptNames);
	}
	
	
	
	public Iterable<Employee> saveAllEmployees(Iterable<Employee> empList)
	{
		return employeeDao.saveAll(empList);
	}
	
	
	public Iterable<Book>  giveBookDetails(String bookName)
	{
		return bookDao.giveBookDetails(bookName);
	}
	
	
	
	
	public List<Person> giveDetails(String lastName,String firstName)
	{
		return	personDao.giveDetails(lastName, firstName);
	}
	
	
	public List<Person> giveDateByLastName(String lastName)
	{
		return personDao.giveDataByLastName(lastName);
	}
	
	
	
	
	
	
	public Iterable<Book> findByBookName(String bookName)
	{
	  return	bookDao.findByBookName(bookName);
	}
	
	public Iterable<Book> saveAllBooks(Iterable<Book> booksList)
	{
		return bookDao.saveAll(booksList);
	}
	
	
	public Iterable<Book> findAllBooks()
	{
		return bookDao.findAll();
	}
	
	
	
	
	
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
