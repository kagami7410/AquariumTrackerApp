package com.aquatics.aqarium_tracker.controllers;

import com.aquatics.aqarium_tracker.models.Parameter;
import com.aquatics.aqarium_tracker.repositories.ParameterRepository;
import com.aquatics.aqarium_tracker.service.ParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class ParameterController {
    @Autowired
    ParameterRepository parameterRepository;
    @Autowired
    ParameterServiceImpl parameterServiceImpl;

    @GetMapping("/parameters/optimum")
    public List<Map<String, Integer>> getObtimumParameters(){
        List<Map<String, Integer>> parameters = parameterServiceImpl.getOptimumParameter();
        return parameters;
    }

    @GetMapping("/parameters/get")
    public ResponseEntity<List<Parameter>> getParameters(){
        List<Parameter> parameters = parameterRepository.findAll();
        return new ResponseEntity<>(parameters, HttpStatus.OK);
    }

}
