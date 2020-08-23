package com.ecommerce.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ecommerce.domains.Customer;
import com.ecommerce.repositories.CustomerRepository;
import com.ecommerce.services.exception.ObjectNotFoundException;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository repo;
	
	public Customer findCustomer(Integer id) 
	{
	 Optional<Customer> obj = repo.findById(id);
	 return obj.orElseThrow(()-> new ObjectNotFoundException(
			 "Object not found!    Id:  "+id+"   Type"+Customer.class.getName()));
		
	}
	
}
