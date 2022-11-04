package com.cooksys.groupproject.services.impl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.cooksys.groupproject.entities.Project;
import com.cooksys.groupproject.entities.Team;
import com.cooksys.groupproject.exceptions.NotFoundException;
import com.cooksys.groupproject.mappers.ProjectMapper;
import com.cooksys.groupproject.repositories.ProjectRepository;
import com.cooksys.groupproject.repositories.TeamRepository;
import org.springframework.stereotype.Service;

import com.cooksys.groupproject.dtos.ProjectRequestDto;
import com.cooksys.groupproject.dtos.ProjectResponseDto;
import com.cooksys.groupproject.services.ProjectService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService{

    private final ProjectRepository projectRepository;
    private final ProjectMapper projectMapper;
    private final TeamRepository teamRepository;

    @Override
    public List<ProjectResponseDto> getAllProjects() {
        return projectMapper.entitiesToResponseDtos(projectRepository.findAll());
    }

    @Override
    public ProjectResponseDto getProjectById(Long id) {
        Optional<Project> project = projectRepository.findById(id);
        if(project.isEmpty()) {
            throw new NotFoundException("That project doesn't exist");
        }
        return projectMapper.entityToResponseDto(project.get());
    }
    
    @Override
    public List<ProjectResponseDto> getProjectsByTeamId(Long id) {
        Optional<Team> team = teamRepository.findById(id);
        if (team.isEmpty()) {
            throw new NotFoundException("No projects found");
        }
        return projectMapper.entitiesToResponseDtos(teamRepository.findById(id).get().getProjects());
    }

    @Override
    public List<ProjectResponseDto> getProjectsByCompanyId(Long id) {
        List<Project> projects = projectRepository.findAll();
        projects.removeIf(project -> !Objects.equals(project.getTeam().getCompany().getId(), id));
        return projectMapper.entitiesToResponseDtos(projects);
    }

	@Override
	public ProjectResponseDto createProject(ProjectRequestDto projectRequestDto) {
		return projectMapper.entityToResponseDto(projectRepository.saveAndFlush(projectMapper.requestDtoToEntity(projectRequestDto)));
	}

}
    