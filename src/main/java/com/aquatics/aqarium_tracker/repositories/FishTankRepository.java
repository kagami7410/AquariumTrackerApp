package com.aquatics.aqarium_tracker.repositories;

import com.aquatics.aqarium_tracker.models.FishTank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FishTankRepository extends JpaRepository<FishTank, Long> {
    public FishTank findTankByName(String FishTankName);


}
