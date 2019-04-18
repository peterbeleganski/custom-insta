package com.workshop.examples.service;

import com.workshop.examples.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class User {

    private UserRepository userRepository;

    public User(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<com.workshop.examples.model.User> getAllPeople() {
        return userRepository.findAll();
    }

}
