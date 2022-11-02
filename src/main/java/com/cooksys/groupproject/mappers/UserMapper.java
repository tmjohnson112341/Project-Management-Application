package com.cooksys.groupproject.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.cooksys.groupproject.dtos.UserResponseDto;
import com.cooksys.groupproject.entities.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
	
	@Mapping(target="username", source="credentials.username")
	@Mapping(target="password", source="credentials.password")
	UserResponseDto entityToResponseDto(User user);
	
	List<UserResponseDto> entitiesToResponseDtos(List<User> users);


}
