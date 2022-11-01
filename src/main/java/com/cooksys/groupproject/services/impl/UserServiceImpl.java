package com.cooksys.groupproject.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.cooksys.groupproject.entities.Credentials;
import com.cooksys.groupproject.entities.User;
import com.cooksys.groupproject.exceptions.NotFoundException;
import com.cooksys.groupproject.mappers.CredentialsMapper;
import com.cooksys.groupproject.mappers.UserMapper;
import org.springframework.stereotype.Service;

import com.cooksys.groupproject.dtos.CredentialsDto;
import com.cooksys.groupproject.dtos.UserResponseDto;
import com.cooksys.groupproject.services.UserService;
import com.cooksys.groupproject.repositories.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

	private final UserRepository userRepository;
	private final UserMapper userMapper;

	private final CredentialsMapper credentialsMapper;

	public User getUserByCredentials(CredentialsDto credentialsDto) {
		return usernameToUser(credentialsDto.getUsername());
	}

	public User usernameToUser(String username) {
		Optional<User> userOptional = userRepository.
				// unfinished
	}

	@Override
	public UserResponseDto getUser(CredentialsDto credentialsDto) {
		User checkUser;

		try {
			checkUser = getUserByCredentials(credentialsDto);
		} catch (NotFoundException notFoundException) {
			throw new NotFoundException("That user does not exist");
		}

		Credentials credentialsInDB = checkUser.getCredentials();
		Credentials sentCredentials = credentialsMapper.dtoToEntity(credentialsDto);

		if (!checkUser.isActive()) {
			throw new NotFoundException("That user does not exist");
		}
		if (!credentialsInDB.equals(sentCredentials)) {
			throw new NotFoundException("Incorrect password");
		}
		checkUser.setStatus("");
		userRepository.saveAndFlush(checkUser);

		return userMapper.entityToDto(getUserByCredentials(credentialsDto));
	}
	@Override
	public List<UserResponseDto> getUsersInCompany(Long id) {
		List<User> users = userRepository.findAll();
		List<User> companyUsers = new ArrayList<>();
		for (User user : users) {
			if (user.getCompany().getId() == (id)) {
				companyUsers.add(user);
			}
		}
		return userMapper.entitiesToResponseDtos(companyUsers);
	}

}
