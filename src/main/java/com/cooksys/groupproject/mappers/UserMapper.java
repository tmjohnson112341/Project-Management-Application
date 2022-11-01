package com.cooksys.groupproject.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.cooksys.groupproject.dtos.UserRequestDto;
import com.cooksys.groupproject.dtos.UserResponseDto;
import com.cooksys.groupproject.entities.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
	
//	@Mapping(target="username", source="credentials.username")
//	UserResponseDto entityToDto(User user);
	
	User requestDtoToEntity(UserRequestDto userRequestDto);
	
	UserResponseDto entityToResponseDto(User user);
	
	List<UserResponseDto> entitiesToResponseDtos(List<User> users);


}
