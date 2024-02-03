package com.example.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.entity.City;

public interface CityRepository extends JpaRepository<City, Integer>{

}
