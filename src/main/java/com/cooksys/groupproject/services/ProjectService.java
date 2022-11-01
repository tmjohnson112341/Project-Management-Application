package com.cooksys.groupproject.services;

import com.cooksys.groupproject.dtos.ProjectResponseDto;

import java.util.List;

public interface ProjectService {

    List<ProjectResponseDto> getAllProjects();

    ProjectResponseDto getProjectById(Long id);

    List<ProjectResponseDto> getProjectsByTeamId(Long id);

    List<ProjectResponseDto> getProjectsByCompanyId(Long id);
}
