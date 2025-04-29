package com.example.portfolio.repository;
//ContactRepository.java

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.portfolio.model.ContactMessage;

@Repository
public interface ContactRepository extends JpaRepository<ContactMessage, Long> {
}

