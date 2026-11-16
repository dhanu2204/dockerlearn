package com.practice.backend_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.practice.backend_service.models.Details;
import com.practice.backend_service.repository.BackRepository;

@Service 
public class BackService {

    @Autowired 
    private BackRepository backRepository;

    public ResponseEntity<?> AddDetails(Details details) {
return ResponseEntity.ok(backRepository.save(details));    }

}
