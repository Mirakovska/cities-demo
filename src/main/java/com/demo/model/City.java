package com.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Objects;

@Table(name = "city")
@Entity
public class City {

    private String country;

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator="CITY_SEQ")
    @SequenceGenerator(name = "CITY_SEQ", sequenceName = "CITY_SEQ", allocationSize=1)
    private Long id;

    @JsonProperty
    private String city;

    private String accent;

    private String region;

    private Double population;

    private Double latitude;

    private Double longitude;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAccent() {
        return accent;
    }

    public void setAccent(String accent) {
        this.accent = accent;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Double getPopulation() {
        return population;
    }

    public void setPopulation(Double population) {
        this.population = population;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return Objects.equals(country, city1.country) &&
                Objects.equals(city, city1.city) &&
                Objects.equals(accent, city1.accent) &&
                Objects.equals(region, city1.region) &&
                Objects.equals(population, city1.population) &&
                Objects.equals(latitude, city1.latitude) &&
                Objects.equals(longitude, city1.longitude);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, city, accent, region, population, latitude, longitude);
    }
}
