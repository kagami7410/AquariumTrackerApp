package com.aquatics.aqarium_tracker.service;

import com.aquatics.aqarium_tracker.repositories.FishTankRepository;

import com.aquatics.aqarium_tracker.repositories.ParameterListRepository;
import com.aquatics.aqarium_tracker.repositories.SingleParameterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@Service
public class ParameterServiceImpl implements ParameterService {
    private List<Map<String, Integer>> parameters = new ArrayList(5);
    private final Logger logger = Logger.getLogger(ParameterServiceImpl.class.getName());

    @Autowired
    ParameterListRepository parameterRepository;

    @Override
    public List<Map<String, Integer>> getOptimumParameter() {
        if(parameters.size() > 0){
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
