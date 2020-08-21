package com.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.domains.City;

public interface CityRepository extends JpaRepository<City,Integer>{

}
