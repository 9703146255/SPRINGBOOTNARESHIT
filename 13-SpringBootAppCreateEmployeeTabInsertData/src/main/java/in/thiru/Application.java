package in.thiru;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.thiru.model.Employee;
import in.thiru.service.EmployeeService;

@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	private EmployeeService empService;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//createEmployee();
		findAllEmployees();
	}
	
	public void createEmployee()
	{
		Employee employee1 = new Employee("John Doe", "Sales", 30000.0);
		Employee employee2 = new Employee("Jane Smith", "Marketing", 35000.0);
		Employee employee3 = new Employee("Bob Johnson", "HR", 32000.0);
		Employee employee4 = new Employee("Alice Brown", "IT", 40000.0);
		Employee employee5 = new Employee("Charlie Wilson", "Finance", 38000.0);
		Employee employee6 = new Employee("Eva Davis", "Sales", 31000.0);
		Employee employee7 = new Employee("Frank White", "Marketing", 36000.0);
		Employee employee8 = new Employee("Grace Lee", "IT", 42000.0);
		Employee employee9 = new Employee("Henry Miller", "HR", 33000.0);
		Employee employee10 = new Employee("Ivy Clark", "Finance", 39000.0);
		
		List<Employee> asList = Arrays.asList(employee1, employee2,employee3,employee4,employee5,employee6,employee7,employee8,employee9,employee10);
		
		
		empService.createEmployee(asList);
	}

	
	
	public void findAllEmployees()
	{
		List<Integer> empList=new ArrayList<>();
		empList.add(7);
		empList.add(88);
		empList.add(9);
		empList.add(10);
		
		
		Iterable<Employee> findEmployes = empService.findAllEmployees(empList);
		
		for(Employee findEmployes1:findEmployes)
		{
			System.out.println(findEmployes1.toString());
		}
		
		
		
	}
	
	
	
}
	
	
	
	

