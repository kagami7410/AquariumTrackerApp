package com.aquatics.aqarium_tracker.repositories;

import com.aquatics.aqarium_tracker.models.SingleParameter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SingleParameterRepository extends JpaRepository<SingleParameter, Long> {
}
