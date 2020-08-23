package com.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ecommerce.domains.Adress;

@Repository
public interface AdressRepository  extends JpaRepository<Adress,Integer>{

}
