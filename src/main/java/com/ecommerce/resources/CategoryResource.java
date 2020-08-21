package com.ecommerce.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.domains.Category;
import com.ecommerce.services.CategoryService;

@RestController
@RequestMapping(value="/categories")
public class CategoryResource {

	@Autowired
	private CategoryService service;
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<?> find( @PathVariable Integer id)
	{										 
		// We 're using a Handler Object
		Category obj = service.find(id);
		return  ResponseEntity.ok().body(obj);
	
	/*The seeking returned with object or null 'll return an Entity, in our case
	Category, sending the body of 'obj' to Rest Controller*/
	

	} 
    
}

/*
Category c1 = new Category(1,"Celulares"); 
Category c2 = new Category(2,"Eletrodomésticos"); 
Category c3= new Category(3,"Cozinha"); 
Category c4 = new Category(4,"Computadores"); 
Category c5 = new Category(5,"Esportes"); 
Category c6 = new Category(6,"Roupas"); 
Category c7 = new Category(7,"Lazer"); 
Category c8 = new Category(8,"Alimentos"); 
Category c9 = new Category(9,"Livros"); 
Category c10 = new Category(10,"Filmes e Séries"); 

Set<Category> categories = new HashSet<>(); 
categories.add(c1);
categories.add(c2);
categories.add(c3);
categories.add(c4);
categories.add(c5);
categories.add(c6);
categories.add(c7);
categories.add(c8);
categories.add(c9);
categories.add(c10);

return categories;
*/
