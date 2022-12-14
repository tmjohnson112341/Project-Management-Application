package com.cooksys.groupproject.controllers;

import com.cooksys.groupproject.dtos.ProjectRequestDto;
import com.cooksys.groupproject.dtos.ProjectResponseDto;
import com.cooksys.groupproject.services.ProjectService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/project")
public class ProjectController {
    private final ProjectService projectService;
    @CrossOrigin
    @GetMapping
    public List<ProjectResponseDto> getAllProjects() {
        return projectService.getAllProjects();
    }
    @CrossOrigin
    @GetMapping("/{id}")
    public ProjectResponseDto getProjectById(@PathVariable Long id) {
        return projectService.getProjectById(id);
    }
    @CrossOrigin
    @GetMapping("/team/{id}")
    public List<ProjectResponseDto> getProjectsByTeamId(@PathVariable Long id) {
        return projectService.getProjectsByTeamId(id);
    }
    @CrossOrigin
    @GetMapping("/company/{id}")
    public List<ProjectResponseDto> getProjectsByCompanyId(@PathVariable Long id) {
        return projectService.getProjectsByCompanyId(id);
    }
    @CrossOrigin
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProjectResponseDto createProject(@RequestBody ProjectRequestDto projectRequestDto) {
    	return projectService.createProject(projectRequestDto);
    }

}
