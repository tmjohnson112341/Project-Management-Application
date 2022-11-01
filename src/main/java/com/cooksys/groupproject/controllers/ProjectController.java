package com.cooksys.groupproject.controllers;

import com.cooksys.groupproject.dtos.ProjectResponseDto;
import com.cooksys.groupproject.services.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/project")
public class ProjectController {
    private final ProjectService projectService;

    @GetMapping
    public List<ProjectResponseDto> getAllProjects() {
        return projectService.getAllProjects();
    }

    @GetMapping("/{id}")
    public ProjectResponseDto getProjectById(@PathVariable Long id) {
        return projectService.getProjectById(id);
    }

    @GetMapping("/team/{teamId}")
    public List<ProjectResponseDto> getProjectsByTeamId(@PathVariable Long id) {
        return projectService.getProjectsByTeamId(id);
    }

    @GetMapping("/company/{companyId}")
    public List<ProjectResponseDto> getProjectsByCompanyId(@PathVariable Long id) {
        return projectService.getProjectsByCompanyId(id);
    }

}
