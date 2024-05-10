package com.projetoweb.aulasnelioalves.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoweb.aulasnelioalves.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
