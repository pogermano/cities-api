package com.pogermano.citiesapi.countries.repository;

import com.pogermano.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
