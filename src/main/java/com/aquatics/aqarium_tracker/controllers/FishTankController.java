package com.aquatics.aqarium_tracker.controllers;

import java.util.List;
import com.aquatics.aqarium_tracker.models.FishTank;

import com.aquatics.aqarium_tracker.models.User;
import com.aquatics.aqarium_tracker.repositories.FishTankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FishTankController {

    @Autowired
    FishTankRepository fishTankRepository;

    @GetMapping("/fishTanks/get")
    public ResponseEntity<List<FishTank>> getFishTanks(){
        return new ResponseEntity<>( fishTankRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping("/fishtank/add")
    public ResponseEntity<String> addFishTank(@RequestBody FishTank fishTank){
        fishTankRepository.save(fishTank);
        return new ResponseEntity<>("Fishtank: " + fishTank.getName(), HttpStatus.CREATED);
    }
}
