package com.github.mateusmaceedo.citiesapi.repository;

import com.github.mateusmaceedo.citiesapi.Country.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
