package com.verizon.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.verizon.dao.CustomerDao;
import com.verizon.model.Customer;
import jakarta.transaction.Transactional;
@Service
@Transactional
public class CustomerService {
	@Autowired
	CustomerDao customerDao;
	public String addCustomer(Customer customer) {
	customerDao.save(customer);
	return "Added";
	}
	public List<Customer> getCustomers() {
	
		List<Customer> productList=customerDao.findAll();
		return productList;
	}
	public Customer updateEmail(Integer cid,Customer customer) {
		Customer p=customerDao.findById(cid).get();
		if(p!=null)
			p.setEmail(customer.getEmail());
		return customerDao.findById(cid).get() ;
	}
	public Customer deleteCustomer(Integer cid) {
		Customer p = customerDao.findById(cid).get();
		if(p!=null)
		  customerDao.deleteById(cid);
		 return p;
		}
	}
