package com.ecommerce.domains;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.ecommerce.domains.enums.CustomerType;

@Entity
public class Customer implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Integer id;
	private String name;
	private String email;
	private String CPForCNPJ;
	private Integer  type;
	private City city;
	private CustomerType customerType;
	
	@OneToMany(mappedBy="customer")
	private List<Adress> adresses = new ArrayList<>();
	
	@ElementCollection
	@CollectionTable(name="phone")
	private Set<String> phones = new HashSet<>();
	

	
	
	
	
	
	public Customer() {
	
	}

	
	
	public Customer(Integer id, String name, String email, String cPForCNPJ, CustomerType type) {
		this.id = id;
		this.name = name;
		this.email = email;
		CPForCNPJ = cPForCNPJ;
		this.type = type.getCode();
	
	}


	

	public CustomerType getCustomerType() {
		return customerType;
	}



	public Set<String> getPhones() {
		return phones;
	}

	public void setPhones(Set<String> phones) {
		this.phones = phones;
	}

	public List<Adress> getAdresses() {
		return adresses;
	}

	public void setAdresses(List<Adress> adresses) {
		this.adresses = adresses;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Integer getId() {
		return id;
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
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCPForCNPJ() {
		return CPForCNPJ;
	}
	
	public void setCPForCNPJ(String cPForCNPJ) {
		CPForCNPJ = cPForCNPJ;
	}
	
	public void setType (CustomerType type) 
	{
		this.type = type.getCode();
	}
	
	public CustomerType getType(){
		return CustomerType.toEnum(type);
	}
	

	
	
	
	
}

