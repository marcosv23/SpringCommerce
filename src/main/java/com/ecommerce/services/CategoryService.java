package com.ecommerce.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.domains.Category;
import com.ecommerce.repositories.CategoryRepository; //*note:
import com.ecommerce.services.exception.ObjectNotFoundException;

@Service
public class CategoryService {
	
	@Autowired//*note:
	private CategoryRepository categoryRepository;//*note:
	

	public Category find(Integer id) 
	{											    //These method comes out
													//from JpaRepository Class
		Optional<Category> obj = categoryRepository.findById(id);
		return obj.orElseThrow(()-> new ObjectNotFoundException(
			"Object was not found!  Id: "+ id +", Type : "+ Category.class.getName()));
		//lambda
		
		/* till before 2.X.X Spring Version//  Java 7 and before
		Category obj = categoryRepository.findOne(id)
		return obj;		
		//
		New Manner with Optional, to avoid the NullPointerException
		*/
		
		
		
	}
	
	
}
