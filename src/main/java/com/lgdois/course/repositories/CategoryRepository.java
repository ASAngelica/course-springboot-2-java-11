package com.lgdois.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lgdois.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
