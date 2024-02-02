package com.aashish.springboot.postgreswithspringjpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aashish.springboot.postgreswithspringjpa.entities.City;
import com.aashish.springboot.postgreswithspringjpa.respositories.CityRepository;

@Service
public class CityService {

	@Autowired
	CityRepository cityRepository;

	public List<City> getCities() {
		return cityRepository.findAll();
	}
}
