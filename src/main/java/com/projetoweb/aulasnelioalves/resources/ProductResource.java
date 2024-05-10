package com.projetoweb.aulasnelioalves.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoweb.aulasnelioalves.entities.Product;
import com.projetoweb.aulasnelioalves.servicies.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	// Autowired serve para o spring fazer a injeção de dependência
	@Autowired
	private ProductService orderService;
	
	@GetMapping
	private ResponseEntity<List<Product>> findAll() {
		List<Product> list = orderService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product obj = orderService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
