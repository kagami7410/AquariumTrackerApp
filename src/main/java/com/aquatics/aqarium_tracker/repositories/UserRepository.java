package com.aquatics.aqarium_tracker.repositories;


import com.aquatics.aqarium_tracker.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.*;

public interface UserRepository extends JpaRepository<User, Long> {
    public Optional<User> findUserByUserName(String userName);

    public Optional<User> findUserById(Long id);

}
