package com.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.domains.State;

public interface StateRepository extends JpaRepository<State,Integer>{

}
