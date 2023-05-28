package com.aquatics.aqarium_tracker.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class defaultController {
    @GetMapping("")
    ResponseEntity<String> defaultMessage(){
        return new ResponseEntity<>("Welcome to Tracker App", HttpStatus.OK);
    }
}
