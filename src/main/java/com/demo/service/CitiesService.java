package com.demo.service;


import com.demo.model.City;

import java.util.List;

public interface CitiesService {
    List<City> getCitiesPerCountry(String country);
}
