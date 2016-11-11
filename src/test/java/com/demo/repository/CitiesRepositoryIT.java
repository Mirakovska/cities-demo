package com.demo.repository;

import com.demo.model.City;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Integration tests for tghe userRepository layer
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class CitiesRepositoryIT {

    private static final String COUNTRY = "mk";
    private City city;

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private CitiesRepository userRepository;

    @Before
    public void setup() {
        city = getCity();
        userRepository.deleteAll();
    }

    @Test
    public void shouldReturnOnlyOneInstanceWhenQueringByCountry() {
        entityManager.persist(city);
        List<City> citiesByCountryList = userRepository.findByCountry(COUNTRY);
        assertEquals(1, citiesByCountryList.size());
        assertEquals(citiesByCountryList.get(0), city);
    }

    @Test
    public void shouldReturnEmptyListWheNoCitiesMatch() {
        List<City> citiesByCountryList = userRepository.findByCountry(COUNTRY);
        assertTrue( citiesByCountryList.isEmpty());
    }

    private City getCity() {
        City city = new City();
        city.setAccent("macedonian");
        city.setCity("skopje");
        city.setCountry(COUNTRY);
        city.setLatitude(225.5);
        city.setLongitude(556.2);
        city.setPopulation(120.054);
        city.setRegion("sk");
        return city;
    }


}
