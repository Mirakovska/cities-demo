package com.demo.controller.impl;

import com.demo.controller.CitiesController;
import com.demo.service.CitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller for handling methods
 */
@RestController
public class CitiesControllerImpl implements CitiesController {

    public static final String EMPTY_STRING = "";

    @Autowired
    private CitiesService citiesService;

    @Override
    @RequestMapping(value = "/cities/{country}")
    public ResponseEntity getCitiesPerCountry(@PathVariable(value = "country") String country) {
        if (country == null || country.trim().equals(EMPTY_STRING)) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(citiesService.getCitiesPerCountry(country), HttpStatus.OK);
    }
}
