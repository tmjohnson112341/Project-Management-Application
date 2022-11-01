package com.cooksys.groupproject.controllers;

import com.cooksys.groupproject.dtos.CompanyRequestDto;
import com.cooksys.groupproject.dtos.CompanyResponseDto;
import com.cooksys.groupproject.services.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/company")

public class CompanyController {

    private final CompanyService companyService;

    @GetMapping
    public List<CompanyRequestDto> getAllCompanies() {
        return companyService.getAllCompanies();
    }

    @GetMapping("/{companyId}")
    public CompanyRequestDto getCompanyById(@PathVariable Long id) {
        return companyService.getCompanyById(id);
    }
}