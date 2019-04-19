package com.workshop.examples.controller;

import com.workshop.examples.model.User;
import com.workshop.examples.model.dto.UserDto;
import com.workshop.examples.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/all")
    public List<User> all() {
        return userService.getAllUsers();
    }

    @PostMapping("/create")
    public void add(@RequestBody UserDto userDto) {
        User newUser = new User(null, userDto.getFirstName(), userDto.getLastName());
        userService.addUser(newUser);
    }

}
