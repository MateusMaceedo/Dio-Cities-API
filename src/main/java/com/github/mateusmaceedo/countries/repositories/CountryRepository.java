package com.github.mateusmacedo.countries.repositories;

import com.github.mateusmacedo.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
