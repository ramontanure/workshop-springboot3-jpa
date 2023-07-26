package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.course.entities.OrderItem;

//Vão ser interfaces
@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
