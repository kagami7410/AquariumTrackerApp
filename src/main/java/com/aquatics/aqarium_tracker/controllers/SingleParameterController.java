package com.aquatics.aqarium_tracker.controllers;

import java.util.*;

import com.aquatics.aqarium_tracker.models.ParametersList;
import com.aquatics.aqarium_tracker.models.SingleParameter;
import com.aquatics.aqarium_tracker.repositories.ParameterListRepository;
import com.aquatics.aqarium_tracker.repositories.SingleParameterRepository;
import com.aquatics.aqarium_tracker.service.ParameterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SingleParameterController {

    @Autowired
    SingleParameterRepository singleParamerterRepository;

    @Autowired
    ParameterServiceImpl parameterService;

    @Autowired
    ParameterListRepository parameterRepository;


    @PostMapping("/singleParameter/add")
    public ResponseEntity<String> addSingleParameter(@RequestBody SingleParameter singleParameter, @RequestParam Long parameterListId) {
        ParametersList parametersList = parameterRepository.getParameterById(parameterListId).orElse(null);
        singleParameter.setParameterList(parametersList);
        singleParamerterRepository.save(singleParameter);
        return new ResponseEntity<>("saved parameter: "+ singleParameter.getTitle(), HttpStatus.CREATED);
    }

    @GetMapping("/singleParameter/get")
    public ResponseEntity<List<SingleParameter>> getSingleParameter(){
        List<SingleParameter> allSingleParameters = singleParamerterRepository.findAll();
        return new ResponseEntity<>(allSingleParameters, HttpStatus.OK);
    }

    @DeleteMapping("/singleParameter/delete")
    public String deleteById(@RequestParam Long id) {
        String singleParameterName = singleParamerterRepository.findById(id).orElse(null).getTitle();
        singleParamerterRepository.deleteById(id);
        return singleParameterName + " :Deleted";
    }

    @DeleteMapping("/singleParameter/deleteAll")
    public String deleteAll() {
        singleParamerterRepository.deleteAll();
        return "all Deleted";
    }

    @PutMapping("/singleParameter/update")
    public String updateSingleParameter(@RequestBody SingleParameter updatedSingleParameter, @RequestParam Long id){
        singleParamerterRepository.findById(id)
                .map(singleParameter -> {
                    singleParameter.setTitle(updatedSingleParameter.getTitle());
                    singleParameter.setMeasurement(updatedSingleParameter.getMeasurement());
                    singleParameter.setMeasurement_date(updatedSingleParameter.getMeasurement_date());
                    return singleParamerterRepository.save(singleParameter);
                });
        return "parameter updated!";
    }
}
