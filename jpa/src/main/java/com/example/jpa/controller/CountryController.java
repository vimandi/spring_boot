package com.example.jpa.controller;


import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.entity.City;
import com.example.jpa.entity.Country;
import com.example.jpa.repository.CountryRepository;

import jakarta.transaction.Transactional;

@RestController
public class CountryController {

	@Autowired
	private CountryRepository countryRepository;
	
	@GetMapping("/getCountries")
	public List<Country> get(){
		return getCountries();
	}

	
	@Transactional
	public List<Country> getCountries(){
		List<Country> cList = countryRepository.findAll();
		for (Country country : cList) {
			Set<City> cityList = country.getCityList();
			
			for (City city : cityList) {
				System.out.println(city.getCity());
			}
			
			System.out.println();
		}
		return countryRepository.findAll();
	}
	
	
}
