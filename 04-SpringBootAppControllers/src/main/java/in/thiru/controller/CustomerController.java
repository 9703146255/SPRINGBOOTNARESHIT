package in.thiru.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/customer")
public class CustomerController {
	
	// insert Customer
		@RequestMapping("/insert")
		public String getCustomerInsert() {
			return "Customer insert method is invoked.....";
		}

		// update Customer
		@RequestMapping("/update")
		public String getCustomerUpdate() {
			return "Customer update method is invoked.....";
		}

		// delete Customer
		@RequestMapping("/delete")
		public String getCustomerDelete() {
			return "Customer delete method is invoked.....";
		}

		// read Customer
		@RequestMapping("/read")
		public String getCustomerread() {
			return "Customer read method is invoked.....";
		}


}
