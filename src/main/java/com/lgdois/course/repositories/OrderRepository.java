package com.lgdois.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lgdois.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
