package com.learn.Ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.Ecommerce.entity.Order;

public interface OrderRepository extends JpaRepository<Order, String>{

}
