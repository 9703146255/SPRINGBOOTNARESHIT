package in.thiru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.thiru.dao.EmployeeDao;
import in.thiru.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao empDao;
	
	
	public Employee saveEmployee(Employee employeeObj)
	{
		return empDao.save(employeeObj);
	}

}
