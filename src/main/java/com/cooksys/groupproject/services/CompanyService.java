package com.cooksys.groupproject.services;

import com.cooksys.groupproject.dtos.CompanyRequestDto;

import java.util.List;

public interface CompanyService {

    CompanyRequestDto getCompanyById(Long id);

    List<CompanyRequestDto> getAllCompanies();
}
