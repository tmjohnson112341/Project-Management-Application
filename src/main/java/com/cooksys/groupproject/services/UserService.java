package com.cooksys.groupproject.services;

import java.util.List;

import com.cooksys.groupproject.dtos.UserResponseDto;

public interface UserService {

    List<UserResponseDto> getUsersInCompany(Long id);

	UserResponseDto getUserById(Long id);

	List<UserResponseDto> getUsers();


}
