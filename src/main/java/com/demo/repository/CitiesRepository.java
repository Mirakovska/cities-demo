package com.demo.repository;

import com.demo.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CitiesRepository extends CrudRepository<City, Long> {

    List<City> findByCountry(String country);
}
