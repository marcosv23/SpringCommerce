package com.ecommerce;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ecommerce.domains.Category;
import com.ecommerce.domains.City;
import com.ecommerce.domains.Product;
import com.ecommerce.domains.State;
import com.ecommerce.repositories.CategoryRepository;
import com.ecommerce.repositories.CityRepository;
import com.ecommerce.repositories.ProductRepository;
import com.ecommerce.repositories.StateRepository;

@SpringBootApplication
public class Main implements CommandLineRunner{
	
	@Autowired
	private CategoryRepository catRepository;
	
	@Autowired
	private ProductRepository prodRepository;
	
	@Autowired
	private CityRepository cityRepository;
	
	@Autowired
	private StateRepository stateRepository;
	
	
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
		
		State s1 = new State(null,"São Paulo");
		State s2 = new State(null,"Bahia");
		State s3 = new State(null,"Paraná");
		State s4 = new State(null,"Rio Grande do Sul");
		//State s5 = new State(null,"Santa Catarina");
		//State s6 = new State(null,"Rio de Janeiro");
		//State s7 = new State(null,"Mato Grosso");
		//State s8 = new State(null,"Mato Grosso do Sul");
		
		City city1 = new City(null,"São José dos Campos",s1);
		City city2 = new City(null,"Prados",s2);
		City city3 = new City(null, "Cascavel",s3);
		City city4 = new City(null,"Santo André",s1);
		City city5 = new City(null,"Frederico Westphalen",s4);
		City city6 = new City(null,"Porto Seguro",s1);
		City city7 = new City(null,"Curitiba",s3);
		City city8 = new City(null,"Porto Alegre",s4);
	
		
		
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
		stateRepository.saveAll(Arrays.asList(s1,s2,s3,s4));
		cityRepository.saveAll(Arrays.asList(city1,city2,city3,city4,city5,city6,city7,city8));
		
	}

}
