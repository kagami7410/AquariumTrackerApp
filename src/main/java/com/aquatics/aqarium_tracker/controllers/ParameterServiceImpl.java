package com.aquatics.aqarium_tracker.controllers;

import com.aquatics.aqarium_tracker.service.ParameterService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@Service
public class ParameterServiceImpl implements ParameterService {
    private List<Map<String, Integer>> parameters = new ArrayList<>(5);
    private final Logger logger = Logger.getLogger(ParameterServiceImpl.class.getName());

    @Override
    public List<Map<String, Integer>> getOptimumParameter() {
        if(parameters.stream().toList().size() > 0){
            return this.parameters;
        }
        else  {
            for(int i = 0; i<2; i++){
               Map<String, Integer> parameter = new HashMap<String, Integer>();
               parameter.put("magnesium", 4352);
               parameters.add(i, parameter);
            }

            return this.parameters;
        }


    }
}
