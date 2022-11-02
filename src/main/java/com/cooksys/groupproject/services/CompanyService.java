package com.cooksys.groupproject.services;

import java.util.List;

import com.cooksys.groupproject.dtos.CompanyResponseDto;

public interface CompanyService {

    CompanyResponseDto getCompanyById(Long id);

    List<CompanyResponseDto> getAllCompanies();
}
