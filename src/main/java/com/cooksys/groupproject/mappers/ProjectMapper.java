package com.cooksys.groupproject.mappers;

import java.util.List;

import com.cooksys.groupproject.dtos.ProjectRequestDto;
import org.mapstruct.Mapper;

import com.cooksys.groupproject.dtos.ProjectRequestDto;
import com.cooksys.groupproject.dtos.ProjectResponseDto;
import com.cooksys.groupproject.entities.Project;

@Mapper(componentModel = "spring")
public interface ProjectMapper {
	
	Project requestDtoToEntity(ProjectRequestDto projectRequestDto);
	
	ProjectResponseDto entityToResponseDto(Project project);
	
	List<ProjectResponseDto> entitiesToResponseDtos(List<Project> projects);

}
