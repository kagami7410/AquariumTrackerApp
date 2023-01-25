package com.aquatics.aqarium_tracker.controllers;

import java.util.List;
import com.aquatics.aqarium_tracker.models.FishTank;

import com.aquatics.aqarium_tracker.repositories.FishTankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/fishTanks")
public class FishTankController {

    @Autowired
    FishTankRepository fishTankRepository;

    @GetMapping("/")
    public ResponseEntity<List<FishTank>> getFishTanks(){
        return new ResponseEntity<>( fishTankRepository.findAll(), HttpStatus.OK);
    }
}
