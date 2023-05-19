package com.aquatics.aqarium_tracker.controllers;

import com.aquatics.aqarium_tracker.models.ParametersList;
import com.aquatics.aqarium_tracker.repositories.FishTankRepository;
import com.aquatics.aqarium_tracker.repositories.ParameterListRepository;
import com.aquatics.aqarium_tracker.service.ParameterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.aquatics.aqarium_tracker.models.FishTank;
import java.util.*;
@RestController
public class ParameterListController {
    @Autowired
    ParameterListRepository parameterListRepository;
    @Autowired
    ParameterServiceImpl parameterServiceImpl;

    @Autowired
    FishTankRepository fishTankRepository;

    @GetMapping("/parameters/optimum")
    public List<Map<String, Integer>> getObtimumParameters(){
        List<Map<String, Integer>> parameters = parameterServiceImpl.getOptimumParameter();
        return parameters;
    }

    @GetMapping("/parameterList/get")
    public ResponseEntity<List<ParametersList>> getParameters(){
        List<ParametersList> parameters = parameterListRepository.findAll();
        return new ResponseEntity<>(parameters, HttpStatus.OK);
    }

    @PostMapping("/parameterList/add")
    public ResponseEntity<String> addParameterList(@RequestParam String title, @RequestParam Long fishTankId){
        FishTank fishTank = fishTankRepository.findFishtankById(fishTankId).orElse(null);
        ParametersList parametersList = new ParametersList(title, fishTank);
        parameterListRepository.save(parametersList);
        return new ResponseEntity<>("parameter list: " + title + " created", HttpStatus.CREATED);
    }

    @DeleteMapping("/parameterList/delete")
    public String deleteById(@RequestParam Long id) {
        String ParameterListTitle =  parameterListRepository.getParameterById(id).orElse(null).getTitle();
        parameterListRepository.deleteById(id);
        return ParameterListTitle + " :Deleted";
    }

}
