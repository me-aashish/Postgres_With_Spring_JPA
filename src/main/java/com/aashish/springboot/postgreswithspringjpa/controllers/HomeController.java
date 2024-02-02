package com.aashish.springboot.postgreswithspringjpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aashish.springboot.postgreswithspringjpa.entities.City;
import com.aashish.springboot.postgreswithspringjpa.services.CityService;

@RestController
public class HomeController {

	@Autowired
	CityService cityService;

	@GetMapping("getcities")
	public List<City> getCities() {

		return cityService.getCities();
	}

	@PostMapping("addcity")
	public City saveCity(@RequestBody City city) {
		return cityService.saveCity(city);
	}
}
