package com.cooksys.groupproject.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cooksys.groupproject.dtos.TeamResponseDto;
import com.cooksys.groupproject.services.TeamService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TeamServiceImpl implements TeamService{@Override
	public List<TeamResponseDto> getTeamsByCompanyId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TeamResponseDto> getTeams() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TeamResponseDto getTeamById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
