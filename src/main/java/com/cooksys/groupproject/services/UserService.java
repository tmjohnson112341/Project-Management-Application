package com.cooksys.groupproject.services;

import com.cooksys.groupproject.dtos.CredentialsDto;
import com.cooksys.groupproject.dtos.UserRequestDto;
import com.cooksys.groupproject.dtos.UserResponseDto;

import java.util.List;

public interface UserService {

    UserResponseDto getUser(CredentialsDto credentialsDto);

    List<UserResponseDto> getUsersInCompany(Long companyId);


}
