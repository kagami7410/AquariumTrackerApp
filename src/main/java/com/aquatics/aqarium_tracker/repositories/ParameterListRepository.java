package com.aquatics.aqarium_tracker.repositories;

import com.aquatics.aqarium_tracker.models.ParametersList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ParameterListRepository extends JpaRepository<ParametersList, Long> {
    public Optional<ParametersList> getParameterById(Long Id);
}
