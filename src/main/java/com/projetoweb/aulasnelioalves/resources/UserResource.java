package com.projetoweb.aulasnelioalves.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoweb.aulasnelioalves.entities.User;
import com.projetoweb.aulasnelioalves.servicies.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	// Autowired serve para o spring fazer a injeção de dependência
	@Autowired
	private UserService userService;
	
	@GetMapping
	private ResponseEntity<List<User>> findAll() {
		List<User> list = userService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User obj = userService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
