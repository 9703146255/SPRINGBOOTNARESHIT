package in.thiru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.thiru.dao.InsuranceDao;
import in.thiru.model.Insurance;

@Service
public class InsuranceService {
	
	@Autowired
	private InsuranceDao insuranceDao;
	
	
	public Insurance saveInsurance(Insurance insuranceObj)
	{
	  return	insuranceDao.save(insuranceObj);
	}

}
