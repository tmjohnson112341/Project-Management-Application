package com.cooksys.groupproject.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cooksys.groupproject.dtos.CredentialsDto;
import com.cooksys.groupproject.dtos.UserResponseDto;
import com.cooksys.groupproject.services.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{@Override
	public UserResponseDto getUser(CredentialsDto credentialsDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserResponseDto> getUsersInCompany(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
