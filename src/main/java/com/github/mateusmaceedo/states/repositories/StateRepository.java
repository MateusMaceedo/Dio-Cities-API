package com.github.mateusmacedo.states.repositories;

import com.github.mateusmacedo.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
