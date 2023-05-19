package com.aquatics.aqarium_tracker.controllers;

import java.util.List;
import com.aquatics.aqarium_tracker.models.FishTank;

import com.aquatics.aqarium_tracker.models.User;
import com.aquatics.aqarium_tracker.repositories.FishTankRepository;
import com.aquatics.aqarium_tracker.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FishTankController {

    @Autowired
    FishTankRepository fishTankRepository;

    @Autowired
    UserRepository userRepository;

    @GetMapping("/fishTanks/get")
    public ResponseEntity<List<FishTank>> getFishTanks(){
        return new ResponseEntity<>( fishTankRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping("/fishtank/add")
    public ResponseEntity<String> addFishTank(@RequestParam String name, @RequestParam Long userId) {
        User user = userRepository.findUserById(userId).orElse(null);
        FishTank fishTank = new FishTank(name, user);
        fishTankRepository.save(fishTank);
        return new ResponseEntity<>("Fishtank: " + fishTank.getName(), HttpStatus.CREATED);
    }

    @DeleteMapping("/fishtank/delete")
    public String deleteById(@RequestParam Long id) {
        String fishtankName = fishTankRepository.findFishtankById(id).orElse(null).getName();
        fishTankRepository.deleteById(id);
        return fishtankName + " :Deleted";
    }

}
