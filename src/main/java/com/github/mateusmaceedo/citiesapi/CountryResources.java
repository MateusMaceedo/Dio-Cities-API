package com.github.mateusmaceedo.citiesapi;

import com.github.mateusmaceedo.citiesapi.Country.Country;
import com.github.mateusmaceedo.citiesapi.repository.CountryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("/countries")
public class CountryResources {


    private CountryRepository repository;

    public CountryResources(CountryRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Country> countries(){
        return repository.findAll();
    }
}
