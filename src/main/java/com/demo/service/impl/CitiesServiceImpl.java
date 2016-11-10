package com.demo.service.impl;

import com.demo.model.City;
import com.demo.repository.CitiesRepository;
import com.demo.service.CitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitiesServiceImpl implements CitiesService {

    @Autowired
    private CitiesRepository citiesRepository;

    @Override
    public List<City> getCitiesPerCountry(String country) {
        return citiesRepository.findByCountry(country);
    }
}
