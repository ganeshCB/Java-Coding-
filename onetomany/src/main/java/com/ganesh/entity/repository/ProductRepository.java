package com.ganesh.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ganesh.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
