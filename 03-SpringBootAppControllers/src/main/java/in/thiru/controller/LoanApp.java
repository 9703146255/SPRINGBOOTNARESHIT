package in.thiru.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanApp {
	
	
	//Car loan
	@RequestMapping(value="/car")
	public String getCarLoan()
	{
		return "Welcome to car loan";
	}
	
	//Home loan
	@RequestMapping(value="/home")
	public String getHomeLoan()
	{
		return "Welcome to Home loan";
	}
	//Personal loan
	@RequestMapping(value="/personal")
	public String getPersonalLoan()
	{
		return "Welcome to Personal loan";
	}
	//Gold loan
	@RequestMapping(value="/gold")
	public String getGoldLoan()
	{
		return "Welcome to Gold loan";
	}

}
