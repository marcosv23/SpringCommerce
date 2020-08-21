package com.ecommerce.resources;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.domains.Product;


@RestController
@RequestMapping(value="/products")
public class ProductResource{
	
	@RequestMapping(method = RequestMethod.GET)
	/*public  String list() 
	{
		return "Deu tudo certo";
	}*/
	public List<Product> listProducts() {
	
		List<Product> products = new ArrayList<>();
		
		Product p1 = new Product(1,"Sansung Galaxy 3600",2000);
		Product p2 = new Product(2,"Geladeira Brastemp",3500);
		Product p3 = new Product(3,"Jogo de Garfos ",100);
		Product p4 = new Product(4,"Dell Optilex 360",300);
		Product p5 = new Product(5,"Bola Basquete Wilson Deluxe",100);
		Product p6 = new Product(6,"Camisa Nike Flex",50);
		Product p7 = new Product(7,"Jogo da Vida",89);
		Product p8 = new Product(8,"Doritos Dippas",10);
		Product p9 = new Product(9,"O caçador de Pipas",20);
		Product p10 = new Product(10,"A vida é bela",50);
		
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		products.add(p6);
		products.add(p7);
		products.add(p8);
		products.add(p9);
		products.add(p10);
	
		return products;
		}
		
	}

