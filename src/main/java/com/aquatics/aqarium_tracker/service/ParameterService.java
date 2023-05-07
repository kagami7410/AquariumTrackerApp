
package com.aquatics.aqarium_tracker.service;
import com.aquatics.aqarium_tracker.models.SingleParameter;
import com.aquatics.aqarium_tracker.repositories.FishTankRepository;
import com.aquatics.aqarium_tracker.repositories.ParameterRepository;

import java.util.*;

public interface ParameterService {
    public List<Map<String, Integer>> getOptimumParameter();
    public String addParameter(FishTankRepository fishTank);
//    public String addSingleParameter(SingleParameter singleParameter);
}
