package com.practice.backend_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.practice.backend_service.models.Details;
import com.practice.backend_service.service.BackService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@CrossOrigin("*")
public class BackController {
    @Autowired 
    private BackService backService;

    @PostMapping("/add")
    public ResponseEntity<?> AddDetails(@RequestBody Details details) {
        return backService.AddDetails(details);
    }
    
}
