package com.ecommerce.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.domains.City;
import com.ecommerce.repositories.CityRepository; //*note:
import com.ecommerce.services.exception.ObjectNotFoundException;

@Service
public class CityService {
	
	@Autowired//*note:
	private CityRepository CityRepository;//*note:
	

	public City find(Integer id) 
	{											    //These method comes out
													//from JpaRepository Class
		Optional<City> obj = CityRepository.findById(id);
		return obj.orElseThrow(()-> new ObjectNotFoundException(
			"Object was not found!  Id: "+ id +", Type : "+ City.class.getName()));
		//lambda
		
		/* till before 2.X.X Spring Version//  Java 7 and before
		City obj = CityRepository.findOne(id)
		return obj;		
		//
		New Manner with Optional, to avoid the NullPointerException
		*/
		
		
		
	}
	
	
}