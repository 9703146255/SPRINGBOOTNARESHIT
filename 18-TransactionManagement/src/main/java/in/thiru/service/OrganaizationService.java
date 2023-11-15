package in.thiru.service;

import javax.management.RuntimeErrorException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.thiru.model.Employee;
import in.thiru.model.Insurance;

@Service
public class OrganaizationService 
{

	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private InsuranceService insuranceService;
	
	
	@Transactional
	public void onboardEmployee(Employee empObj,Insurance insObj)
	{
		employeeService.saveEmployee(empObj);
		
		
		if (insObj.getHealthInsuranceSchemeName().length() <= 4) {
			throw new RuntimeErrorException(null, "Error in Insurance");
		} else {
			insObj.setEmpId(empObj.getEmpId());

			insuranceService.saveInsurance(insObj);
		}
	}
	
	
	
	
	
	
	
}
