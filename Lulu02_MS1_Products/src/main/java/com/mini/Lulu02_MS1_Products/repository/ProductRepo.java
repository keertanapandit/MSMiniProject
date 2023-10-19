package com.mini.Lulu02_MS1_Products.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mini.Lulu02_MS1_Products.entity.Products;

public interface ProductRepo extends JpaRepository<Products, Integer> {

}
