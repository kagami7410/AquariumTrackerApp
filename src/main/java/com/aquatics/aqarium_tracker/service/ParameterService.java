
package com.aquatics.aqarium_tracker.service;
import com.aquatics.aqarium_tracker.repositories.FishTankRepository;

import java.util.*;

public interface ParameterService {
    public List<Map<String, Integer>> getOptimumParameter();
}
