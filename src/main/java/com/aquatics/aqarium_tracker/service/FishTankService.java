package com.aquatics.aqarium_tracker.service;

import com.aquatics.aqarium_tracker.models.User;
import com.aquatics.aqarium_tracker.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FishTankService {
    @Autowired
    UserRepository userRepository;

    public User getUserById(Long userId){
        return userRepository.findUserById(userId).orElse(null);
    }
}
