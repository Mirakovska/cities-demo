package com.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

public interface CitiesController {

    ResponseEntity getCitiesPerCountry(@PathVariable(value = "country") String country);
}
