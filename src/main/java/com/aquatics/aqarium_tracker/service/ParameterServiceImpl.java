package com.aquatics.aqarium_tracker.service;

import com.aquatics.aqarium_tracker.models.ParametersList;
import com.aquatics.aqarium_tracker.models.SingleParameter;
import com.aquatics.aqarium_tracker.repositories.FishTankRepository;

import com.aquatics.aqarium_tracker.repositories.ParameterRepository;
import com.aquatics.aqarium_tracker.repositories.SingleParameterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aquatics.aqarium_tracker.models.FishTank;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@Service
public class ParameterServiceImpl implements ParameterService {
    private List<Map<String, Integer>> parameters = new ArrayList<>(5);
    private final Logger logger = Logger.getLogger(ParameterServiceImpl.class.getName());
    @Autowired
    SingleParameterRepository singleParameterRepository;
    @Autowired
    ParameterRepository parameterRepository;

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

//    public String addParameterList(FishTank fishTank, SingleParameter singleParameter){
//
//        parameterRepository.save(parametersList);
//        String message = singleParameter.getTitle() + "saved in the table";
//        return message;
//
//    }



    @Override
    public String addParameter(FishTankRepository fishTank) {
        return null;
    }



}
