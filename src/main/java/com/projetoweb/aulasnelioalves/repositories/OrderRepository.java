package com.projetoweb.aulasnelioalves.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoweb.aulasnelioalves.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
