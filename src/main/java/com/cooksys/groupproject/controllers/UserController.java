package com.cooksys.groupproject.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cooksys.groupproject.dtos.UserResponseDto;
import com.cooksys.groupproject.services.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")

public class UserController {

    private final UserService userService;
    @CrossOrigin
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<UserResponseDto> getUsers(){
    	return userService.getUsers();
    }
    
    @GetMapping("/{id}")
    public UserResponseDto getUserById(@PathVariable Long id) {
    	return userService.getUserById(id);
    }

    @GetMapping("/company/{id}")
    public List<UserResponseDto> getUsersInCompany(@PathVariable Long id) {
        return userService.getUsersInCompany(id);
    }


    }

