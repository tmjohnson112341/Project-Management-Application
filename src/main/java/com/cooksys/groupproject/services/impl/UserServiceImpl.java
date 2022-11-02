package com.cooksys.groupproject.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cooksys.groupproject.dtos.UserResponseDto;
import com.cooksys.groupproject.entities.User;
import com.cooksys.groupproject.exceptions.NotFoundException;
import com.cooksys.groupproject.mappers.UserMapper;
import com.cooksys.groupproject.repositories.UserRepository;
import com.cooksys.groupproject.services.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    
    public User getUser(Long id) {
    	Optional<User> optionalUser = userRepository.findById(id);
    	if(optionalUser.isEmpty()) {
    		throw new NotFoundException("No users fonud with the id: " + id);
    	}
    	return optionalUser.get();
    }

    @Override
    public List<UserResponseDto> getUsersInCompany(Long id) {
        List<User> users = userRepository.findAll();
        List<User> companyUsers = new ArrayList<>();
        for (User user : users) {
            if (Objects.equals(user.getCompany().getId(), id)) {
                companyUsers.add(user);
            }
        }
        return userMapper.entitiesToResponseDtos(companyUsers);
    }

	@Override
	public UserResponseDto getUserById(Long id) {
		return userMapper.entityToResponseDto(getUser(id));
	}

	@Override
	public List<UserResponseDto> getUsers() {
		return userMapper.entitiesToResponseDtos(userRepository.findAll());
	}

}
    
    
