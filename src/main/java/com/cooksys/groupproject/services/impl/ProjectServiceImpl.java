package com.cooksys.groupproject.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cooksys.groupproject.dtos.ProjectResponseDto;
import com.cooksys.groupproject.services.ProjectService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService{@Override
	public List<ProjectResponseDto> getAllProjects() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProjectResponseDto getProjectById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProjectResponseDto> getProjectsByTeamId(Long teamId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProjectResponseDto> getProjectsByCompanyId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
