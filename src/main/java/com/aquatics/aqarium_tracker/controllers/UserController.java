package com.aquatics.aqarium_tracker.controllers;


import com.aquatics.aqarium_tracker.models.User;
import com.aquatics.aqarium_tracker.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("users/getAll")
    ResponseEntity<List<User>> getAllUsers(){
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }
    @PostMapping("addUser")
    ResponseEntity<String> addUser(@RequestBody User newUser){
        List<String> allUsernames = new ArrayList<>();
        List<User> allUsers = userRepository.findAll();

        //adds all the usernames to allUsernames Lists
        allUsers.stream()
                        .forEach(usr -> allUsernames.add(usr.getUserName()));

        boolean usernameExists = allUsernames.stream()
                        .anyMatch(username -> username.equals(newUser.getUserName()));
        System.out.println(usernameExists + "username:" + newUser.getUserName());

        if(usernameExists == true){
            return new ResponseEntity<>("User: "+ newUser.getName() +" already exists", HttpStatus.BAD_REQUEST);
        }
        else{
            User user = userRepository.save(newUser);
            return new ResponseEntity<>("User: "+ user.getName() + "added!", HttpStatus.CREATED);
        }
    }

    @Override
    public String toString() {
        return "UserController{" +
                "userRepository=" + userRepository +
                '}';
    }
}
