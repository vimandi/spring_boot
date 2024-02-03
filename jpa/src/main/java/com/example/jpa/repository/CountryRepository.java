package com.example.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.entity.Country;

public interface CountryRepository extends JpaRepository<Country, Integer>{

}
