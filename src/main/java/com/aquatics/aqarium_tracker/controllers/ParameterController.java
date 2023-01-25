package com.aquatics.aqarium_tracker.controllers;

import com.aquatics.aqarium_tracker.service.ParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController("")
public class ParameterController {

    @Autowired
    ParameterServiceImpl parameterServiceImpl;

    @GetMapping("/optimum-parameters")
    public List<Map<String, Integer>> getObtimumParameters(){
        List<Map<String, Integer>> parameters = parameterServiceImpl.getOptimumParameter();
        return parameters;
    }
}
