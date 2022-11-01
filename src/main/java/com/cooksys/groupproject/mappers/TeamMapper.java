package com.cooksys.groupproject.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.cooksys.groupproject.dtos.TeamRequestDto;
import com.cooksys.groupproject.dtos.TeamResponseDto;
import com.cooksys.groupproject.entities.Team;

@Mapper(componentModel = "spring")
public interface TeamMapper {
	
	Team requestDtoToEntity(TeamRequestDto teamRequestDto);
	
	TeamResponseDto entityToResponseDto(Team team);
	
	List<TeamResponseDto> entitiesToResponseDtos(List<Team> teams);
	
}
