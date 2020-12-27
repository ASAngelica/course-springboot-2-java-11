package com.lgdois.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lgdois.course.entities.Category;
import com.lgdois.course.entities.User;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
