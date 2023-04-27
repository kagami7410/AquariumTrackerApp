package com.aquatics.aqarium_tracker.repositories;


import com.aquatics.aqarium_tracker.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    public Optional<User> findUserByUserName(String userName);
}
