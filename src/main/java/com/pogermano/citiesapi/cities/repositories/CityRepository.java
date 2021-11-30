package com.pogermano.citiesapi.cities.repositories;

import com.pogermano.citiesapi.cities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
