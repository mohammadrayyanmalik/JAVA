package com.learn.Ecommerce.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.learn.Ecommerce.entity.Category;


@RepositoryRestResource(path = "category")
public interface CategoryRepository extends JpaRepository<Category, String>{

}
