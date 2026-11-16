package com.practice.backend_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.backend_service.models.Details;

@Repository 
public interface BackRepository extends JpaRepository<Details, Integer>{
}
