package com.ecommerce.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.domains.City;
import com.ecommerce.services.CityService;

@RestController
@RequestMapping(value = "/cities")
public class CityResource {

	@Autowired
	private CityService service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		// We 're using a Handler Object
		City obj = service.find(id);
		return ResponseEntity.ok().body(obj);

		/*
		 * The seeking returned with object or null 'll return an Entity, in our case
		 * City, sending the body of 'obj' to Rest Controller
		 */

	}

}

/*
 * City c1 = new City(1,"Celulares"); City c2 = new
 * City(2,"Eletrodomésticos"); City c3= new City(3,"Cozinha");
 * City c4 = new City(4,"Computadores"); City c5 = new
 * City(5,"Esportes"); City c6 = new City(6,"Roupas"); City c7 =
 * new City(7,"Lazer"); City c8 = new City(8,"Alimentos"); City
 * c9 = new City(9,"Livros"); City c10 = new
 * City(10,"Filmes e Séries");
 * 
 * Set<City> categories = new HashSet<>(); categories.add(c1);
 * categories.add(c2); categories.add(c3); categories.add(c4);
 * categories.add(c5); categories.add(c6); categories.add(c7);
 * categories.add(c8); categories.add(c9); categories.add(c10);
 * 
 * return categories;
 */
