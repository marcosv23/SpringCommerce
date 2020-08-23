package com.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ecommerce.domains.Category;

@Repository
public interface CategoryRepository  extends JpaRepository<Category,Integer>{

}
