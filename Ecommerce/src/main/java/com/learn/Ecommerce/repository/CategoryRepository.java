package com.learn.Ecommerce.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.Ecommerce.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, String>{

}
