package com.demo;

import org.junit.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.Assert.assertTrue;

@ContextConfiguration(classes = CitiesDemoApplicationTests.class)
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = "com.demo.repository")
public class CitiesDemoApplicationTests {

    @Test
    public void contextLoad() {
        assertTrue(true);
    }

}
