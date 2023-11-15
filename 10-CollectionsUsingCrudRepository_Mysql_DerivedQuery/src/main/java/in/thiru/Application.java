package in.thiru;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.thiru.model.Person;
import in.thiru.service.PersonService;

@SpringBootApplication
public class Application implements CommandLineRunner 
{

	@Autowired
	private PersonService personService;
	
	public static void main(String[] args) 
	{
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		
		//createPersons();
		//getPersonByIds();
		// findByLastNameOrFirstName();
		// findByLastNameAndFirstName();
		
		//findByLastNameOrderByCreatedDateDesc();
		//findByAgeLessThanEqual();
		
		//findByFirstNameLike();
		//findByLastNameAndAgeLessThanEqual();
		
		findByCreatedDateBetween();
	}
	
	private void createPersons()
	{
		List<Person> personList = Arrays.asList(
				new Person("Kiran", "kumar", "kiran@gmail.com", 20),
				new Person("Ram", "kumar", "ram@gmail.com", 22),
				new Person("RamKiran", "LaxmiKiran", "sita@gmail.com", 30),
				new Person("Lakshamn", "Seth", "seth@gmail.com", 50),
				new Person("Sita", "Kumar", "lakshman@gmail.com", 50),
				new Person("Ganesh", "Kumar", "ganesh@gmail.com", 50),
				new Person("KiranKiran", "kumar", "kiran@yahoo.com", 20),
				new Person("RamRam", "kumar", "ram@yahoo.com", 22),
				new Person("RamKiranRamKiran", "LaxmiKiran", "sita@yahoo.com", 30),
				new Person("RamKiranRamKiran", "Seth", "seth@yahoo.com", 50),
				new Person("SitaSita", "Kumar", "lakshman@yahoo.com", 50),
				new Person("GaneshSita", "Kumar", "ganesh@yahoo.com", 50));

		Iterable<Person> list = personService.saveAllPersons(personList);
		for (Person person : list) 
		{
			System.out.println("Person Object" + person.toString());

		}
	}
	
	private void getPersonByIds() {
		List<Integer> personList = new ArrayList<Integer>();
		personList.add(1);
		personList.add(2);
		personList.add(12);
		personList.add(5);
		personList.add(6);
		personList.add(20);
		personList.add(40);
		personList.add(11);
		personList.add(15);
		personList.add(3);
		personList.add(4);

		// findPerson ==> select * from tbl_person where person_id in
		// (1,2,12,5,6......);
		Iterable<Person> personsList = personService.findAllPersons(personList);
		for (Person person : personsList) {
			System.out.println("Person Object" + person.toString());

		}
	}

	
	private void findByLastNameOrFirstName()
	{
		Iterable<Person> p = personService.findByLastNameOrFirstName("kumar", "Ram");
	
	
	  for(Person p1:p)
	  {
		  System.out.println("Person object :"+p1.toString());
	  }
	
	
	}
	
	private void findByLastNameAndFirstName()
	{
		Person p = personService.findByLastNameAndFirstName("kumar", "Ram");
		
		System.out.println(p.toString());
		
	}
	
	
	private void findByLastNameOrderByCreatedDateDesc()
	{
		List<Person> p1 = personService.findByLastNameOrderByCreatedDateDesc("kumar");
		
		
		for(Person p2:p1)
		{
			System.out.println(p2.toString());
		}
	}
	
	private void findByAgeLessThanEqual()
	{
		List<Person> p1 = personService.findByAgeLessThanEqual(40);
	
	  for(Person p2:p1)
	  {
		  System.out.println(p2.toString());
	  }
	
	}
	
	private void findByFirstNameLike()
	{
		List<Person> p1 = personService.findByFirstNameLike("%Ram%");
		
		for(Person p2:p1)
		{
			System.out.println("Person object :"+p2.toString());
		}
		
	}
	
	private void  findByLastNameAndAgeLessThanEqual()
	{
		List<Person> p1 = personService.findByLastNameAndAgeLessThanEqual("kumar", 40);
		
		for(Person p2:p1)
		{
			System.out.println(p2.toString());
		}
	}
	
	private void findByCreatedDateBetween() throws ParseException
	{
		List<Person> p1 = personService.findByCreatedDateBetween(getDateWithTime("2023-10-22 19:50:06"), getDateWithTime("2023-10-22 19:51:00"));
		
		for(Person p2:p1)
		{
			System.out.println(p2.toString());
		}
	}
	
	
	private Date getDateWithTime(String dateString) throws ParseException
	{
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		return format.parse(dateString);
	}
}

