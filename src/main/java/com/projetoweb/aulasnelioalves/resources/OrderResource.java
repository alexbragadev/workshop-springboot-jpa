package com.projetoweb.aulasnelioalves.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoweb.aulasnelioalves.entities.Order;
import com.projetoweb.aulasnelioalves.servicies.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	
	// Autowired serve para o spring fazer a injeção de dependência
	@Autowired
	private OrderService orderService;
	
	@GetMapping
	private ResponseEntity<List<Order>> findAll() {
		List<Order> list = orderService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		Order obj = orderService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
