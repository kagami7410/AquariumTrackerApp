package com.aquatics.aqarium_tracker.repositories;

import com.aquatics.aqarium_tracker.models.Parameter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParameterRepository extends JpaRepository<Parameter, Long> {
}
