package com.aquatics.aqarium_tracker.repositories;

import com.aquatics.aqarium_tracker.models.FishTank;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FishTankRepository extends JpaRepository<FishTank, Long> {
    public Optional <FishTank> findTankByName(String FishTankName);

    public Optional <FishTank> findFishtankById(Long fishTankId);


}
