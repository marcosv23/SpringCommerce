package com.ecommerce;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ecommerce.domains.Category;
import com.ecommerce.domains.Product;
import com.ecommerce.repositories.CategoryRepository;
import com.ecommerce.repositories.ProductRepository;

@SpringBootApplication
public class Main implements CommandLineRunner{
	
	@Autowired
	private CategoryRepository catRepository;
	
	@Autowired
	private ProductRepository prodRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category c1 = new Category(null,"Filmes e séries");
		Category c2 = new Category(null,"Informática");
		Category c3 = new Category(null,"Eletrodomésticos");
		Category c4 = new Category(null,"Calçados");
		Category c5 = new Category(null,"Roupas");
		
		Product p1 = new Product(null,"Iron Man 2",35.78f);
		Product p2 = new Product(null,"Forrest Gump",35.78f);
		Product p3 = new Product(null,"Geladeira 2 portas",35.78f);
		Product p4 = new Product(null,"Fogão 8 bocas",35.78f);
		Product p5 = new Product(null,"Nike SB 41",35.78f);
		Product p6 = new Product(null,"Adidas Nsei",35.78f);
		Product p7 = new Product(null,"Shorts Lamarin 32",35.78f);
		Product p8 = new Product(null,"Blusa Nike SB Deluxe",35.78f);
		Product p9 = new Product(null,"Pc Dell Optilex 360",35.78f);
		Product p10 = new Product(null,"MacPro 25.7",35.78f);
		
		p1.getCategories().addAll(Arrays.asList(c1));
		p2.getCategories().addAll(Arrays.asList(c1));
		p3.getCategories().addAll(Arrays.asList(c3));
		p4.getCategories().addAll(Arrays.asList(c3));
		p5.getCategories().addAll(Arrays.asList(c4));
		p6.getCategories().addAll(Arrays.asList(c4));
		p7.getCategories().addAll(Arrays.asList(c5));
		p8.getCategories().addAll(Arrays.asList(c5));
		p9.getCategories().addAll(Arrays.asList(c2));
		p10.getCategories().addAll(Arrays.asList(c2));
		
		c1.getProducts().addAll(Arrays.asList(p1,p2));
		c2.getProducts().addAll(Arrays.asList(p9,p10));
		c3.getProducts().addAll(Arrays.asList(p3,p4));
		c4.getProducts().addAll(Arrays.asList(p5,p6));
		c5.getProducts().addAll(Arrays.asList(p7,p8));
		
		catRepository.saveAll(Arrays.asList(c1,c2,c3,c4,c5));
		prodRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10));
		
	}

}
