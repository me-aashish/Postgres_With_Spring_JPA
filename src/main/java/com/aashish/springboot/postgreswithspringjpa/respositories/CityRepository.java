package com.aashish.springboot.postgreswithspringjpa.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aashish.springboot.postgreswithspringjpa.entities.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

	City findByCityName(String cityName);

}
