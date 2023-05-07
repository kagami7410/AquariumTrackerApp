package com.aquatics.aqarium_tracker.controllers;

import com.aquatics.aqarium_tracker.models.SingleParameter;
import com.aquatics.aqarium_tracker.repositories.SingleParameterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SingleParameterController {

    @Autowired
    SingleParameterRepository singleParamerterRepository;


    @PostMapping("/singleParameter/add")
    public ResponseEntity<String> addSingleParameter(@RequestBody SingleParameter singleParameter) {
        singleParamerterRepository.save(singleParameter);
        return new ResponseEntity<>("saved parameter: "+ singleParameter.getTitle(), HttpStatus.CREATED);
    }
}
