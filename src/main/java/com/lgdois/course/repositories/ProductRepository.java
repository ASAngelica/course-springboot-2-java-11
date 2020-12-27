package com.lgdois.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lgdois.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
