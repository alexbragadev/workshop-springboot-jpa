package com.projetoweb.aulasnelioalves.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoweb.aulasnelioalves.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
