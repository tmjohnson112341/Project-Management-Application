package com.cooksys.groupproject.services;

import com.cooksys.groupproject.dtos.TeamResponseDto;

import java.util.List;

public interface TeamService {

    List<TeamResponseDto> getTeamsByCompanyId(Long id);

    List<TeamResponseDto> getTeams();

    TeamResponseDto getTeamById(Long id);
}
