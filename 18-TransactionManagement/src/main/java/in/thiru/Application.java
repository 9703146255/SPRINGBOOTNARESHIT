package in.thiru;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.thiru.model.Employee;
import in.thiru.model.Insurance;
import in.thiru.service.OrganaizationService;

@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	private OrganaizationService orgService;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		
		Employee empObj=new Employee();
		empObj.setEmpName("Sandhya");
		
		Insurance insObj=new Insurance();
		insObj.setHealthInsuranceSchemeName("TopUP");
		insObj.setCoverageAmount(100000);
		
		orgService.onboardEmployee(empObj, insObj);
		
		
	}

}
