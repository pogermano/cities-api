package com.pogermano.citiesapi.countries.repositories;

import com.pogermano.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
