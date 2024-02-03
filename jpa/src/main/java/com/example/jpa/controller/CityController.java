package com.example.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.entity.City;
import com.example.jpa.repository.CityRepository;

@RestController
public class CityController {

	@Autowired
	CityRepository cityRepository;
	
	
	@GetMapping("/getCities")
	public List<City> getCities(){
		
		return cityRepository.findAll();
	}
}
