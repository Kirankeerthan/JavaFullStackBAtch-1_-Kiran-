package com.verizon.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.model.Customer;
import com.verizon.service.CustomerService;
@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	@GetMapping("/customers")
	public List<Customer> getCustomerDetails() {  // need to implement
		
		List<Customer> customers=customerService.getCustomers();  //sample list need to replace
		return customers;
	}

	
	  @PostMapping("/addcustomer") 
	  public String  addProductDetails(@RequestBody	  Customer customer) { // need to implement
		  customerService.addCustomer(customer);
		  return  "Added";
	 
	  }
	
	@PutMapping("/customer/{cid}") 
	public Customer updateEmailDetails(@PathVariable("cid") Integer cid,@RequestBody Customer customer) {
		
		return customerService.updateEmail(cid, customer);
	}
	
	@DeleteMapping("/customer/{cid}") 
	public Customer deleteCustomerDetails(@PathVariable("cid") Integer cid) {
		// need to implement
		return customerService.deleteCustomer(cid); 
	}
	
}
