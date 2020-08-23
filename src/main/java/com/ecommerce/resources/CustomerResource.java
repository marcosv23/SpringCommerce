package com.ecommerce.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.domains.Customer;
import com.ecommerce.services.CustomerService;

@RestController
@RequestMapping(value="/customers")
public class CustomerResource 
{

	@Autowired
	CustomerService service;
	
	@RequestMapping(value="/{id}", method =RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id)
	{
		Customer obj= service.findCustomer(id);
		return ResponseEntity.ok().body(obj);
	}

}
