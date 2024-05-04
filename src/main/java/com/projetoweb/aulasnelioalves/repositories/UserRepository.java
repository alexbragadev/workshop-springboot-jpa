package com.projetoweb.aulasnelioalves.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoweb.aulasnelioalves.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
