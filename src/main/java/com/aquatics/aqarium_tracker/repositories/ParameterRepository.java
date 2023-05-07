package com.aquatics.aqarium_tracker.repositories;

import com.aquatics.aqarium_tracker.models.ParametersList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParameterRepository extends JpaRepository<ParametersList, Long> {
}
