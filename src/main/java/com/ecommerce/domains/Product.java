package com.ecommerce.domains;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Product implements Serializable{
	private static final long serialVersionUID = 1L;
	
	//Mapping joining into main database
	@JsonBackReference // disallow the  categories' searching for each product 
	@ManyToMany
	@JoinTable(
			name ="product_category", //main table
			joinColumns = @JoinColumn(name = "product_id"),//which name 'll be used to FK into product_category
			inverseJoinColumns = @JoinColumn(name="category_id") // which name 'll be used to FK into product_category
			)
	Set<Category> categories = new HashSet<Category>();
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private float value;
	public Integer getId() {
		return id;
	}
	
	

	public Product() {
		super();
	}

	public Product(Integer id, String name, float value) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
	}


	public Set<Category> getCategories() {
		return categories;
	}


	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public float getValue() {
		return value;
	}
	
	public void setValue(float value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", value=" + value + "]";
	}



	
}
