package in.thiru.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.thiru.model.Employee;


@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer>{

	

}
