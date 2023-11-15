package in.thiru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.thiru.dao.EmployeeDao;
import in.thiru.model.Employee;

@Service
public class EmployeeService {
	
	
	@Autowired
	private EmployeeDao employeeDao;
	
	public Iterable<Employee> createEmployee(Iterable<Employee> empList)
	{
		return employeeDao.saveAll(empList);
	}
	
	
	public Iterable<Employee> findAllEmployees( Iterable<Integer> empList)
	{
		return employeeDao.findAllById(empList);
	}

}
