package com.cooksys.groupproject.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cooksys.groupproject.dtos.TeamResponseDto;
import com.cooksys.groupproject.entities.Team;
import com.cooksys.groupproject.exceptions.NotFoundException;
import com.cooksys.groupproject.mappers.TeamMapper;
import com.cooksys.groupproject.repositories.TeamRepository;
import com.cooksys.groupproject.services.TeamService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TeamServiceImpl implements TeamService{
	
	private final TeamRepository teamRepository;
	private final TeamMapper teamMapper;
	
	public Team getTeam(Long id) {
		Optional<Team> optionalTeam = teamRepository.findById(id);
		if(optionalTeam.isEmpty()) {
			throw new NotFoundException("No teams found with the id: " + id);
		}
		return optionalTeam.get();
	}
	
    @Override
    public List<TeamResponseDto> getTeamsByCompanyId(Long id) {

        List<Team> teams = new ArrayList<>();
        for (Team team : teamRepository.findAll()) {
            if (Objects.equals(team.getCompany().getId(), id)) {
                teams.add(team);
            }
        }
        return teamMapper.entitiesToResponseDtos(teams);
    }

	@Override
	public List<TeamResponseDto> getTeams() {
		return teamMapper.entitiesToResponseDtos(teamRepository.findAll());
	}

	@Override
	public TeamResponseDto getTeamById(Long id) {
		return teamMapper.entityToResponseDto(getTeam(id));
	}

}
