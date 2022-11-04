package com.cooksys.groupproject.controllers;

import com.cooksys.groupproject.dtos.TeamResponseDto;
import com.cooksys.groupproject.services.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/team")
public class TeamController {

    private final TeamService teamService;
    
    @CrossOrigin
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<TeamResponseDto> getTeams() {
        return teamService.getTeams();
    }

    @CrossOrigin
    @GetMapping("/company/{id}")
    public List<TeamResponseDto> getTeamsByCompanyId(@PathVariable Long id) {
        return teamService.getTeamsByCompanyId(id);
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public TeamResponseDto getTeamById(@PathVariable Long id) {
        return teamService.getTeamById(id);
    }



}