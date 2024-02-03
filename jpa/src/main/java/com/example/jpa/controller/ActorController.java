package com.example.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.entity.Actor;
import com.example.jpa.repository.ActorRepository;

@RestController
public class ActorController {
	
	@Autowired
	ActorRepository actorRepository;
	
	@GetMapping("/getActors")
	public List<Actor> getActors() {
		List<Actor> actorList = actorRepository.findAll();
		return actorList;
	}

}
