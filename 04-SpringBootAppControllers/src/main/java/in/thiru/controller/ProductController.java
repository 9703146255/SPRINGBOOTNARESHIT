package in.thiru.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 crud operation
 =================
 create -->insert
 read	-->retrieve
 update	-->update
 delete	-->delete
 */
@RestController
@RequestMapping(value="/product")
public class ProductController {

	// insert product
	@RequestMapping("/insert")
	public String getProductInsert() {
		return "product insert method is invoked.....";
	}

	// update product
	@RequestMapping("/update")
	public String getProductUpdate() {
		return "product update method is invoked.....";
	}

	// delete product
	@RequestMapping("/delete")
	public String getProductDelete() {
		return "product delete method is invoked.....";
	}

	// read product
	@RequestMapping("/read")
	public String getProductread() {
		return "product read method is invoked.....";
	}

}
