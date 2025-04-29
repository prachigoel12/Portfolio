package com.example.portfolio.service;


//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.portfolio.model.ContactMessage;
import com.example.portfolio.repository.ContactRepository;

@Service
public class ContactService {

    private final ContactRepository repository;

//    @Autowired
    public ContactService(ContactRepository repository) {
        this.repository = repository;
    }

    public void handleContactForm(String name, String email, String message) {
        ContactMessage contactMessage = new ContactMessage(name, email, message);
        repository.save(contactMessage);
    }
}
