package com.cooksys.groupproject.services;

import java.util.List;

import com.cooksys.groupproject.dtos.CredentialsDto;
import com.cooksys.groupproject.dtos.UserResponseDto;

public interface UserService {

    UserResponseDto getUser(CredentialsDto credentialsDto);

    List<UserResponseDto> getUsersInCompany(Long id);


}
