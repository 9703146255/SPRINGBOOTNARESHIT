package in.thiru.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

//1  vijay  sales  30000


@Entity
@Table(name="Employee_table")
public class Employee 
{
	
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="emp_id")
     private Integer empId;
	
	@Column(name="emp_name")
     private String empName;
	
     private String dept;
     
     private double salary;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(String empName, String dept, double salary) {
		super();
		
		this.empName = empName;
		this.dept = dept;
		this.salary = salary;
	}
     
	public Employee()
	{
		
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", dept=" + dept + ", salary=" + salary + "]";
	}
     
     
     
}
