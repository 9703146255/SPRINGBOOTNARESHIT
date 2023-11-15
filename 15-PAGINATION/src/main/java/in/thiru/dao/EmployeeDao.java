package in.thiru.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import in.thiru.model.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Integer>{
	
	
	public Iterable<Object[]> giveMaxSalariesByDept(List<String> deptNames);

}
