package com.pogermano.citiesapi.states.repositories;

import com.pogermano.citiesapi.states.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}