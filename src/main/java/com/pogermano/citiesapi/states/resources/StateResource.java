package com.pogermano.citiesapi.states.resources;

import com.pogermano.citiesapi.states.State;
import com.pogermano.citiesapi.states.repositories.StateRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/states")
public class StateResource {

    private final StateRepository repository;

    public StateResource(final StateRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Page<State> states(final Pageable page) {
        return repository.findAll(page);
    }
/*    @GetMapping
    public List<State> states() {
        return repository.findAll();
    }*/
}