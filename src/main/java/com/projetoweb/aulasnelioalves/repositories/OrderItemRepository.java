package com.projetoweb.aulasnelioalves.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoweb.aulasnelioalves.entities.OrderItem;
import com.projetoweb.aulasnelioalves.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk>{
	
}
