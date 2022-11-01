package com.cooksys.groupproject.services;

import com.cooksys.groupproject.dtos.CompanyRequestDto;

import java.util.List;

public interface CompanyService {

    CompanyRequestDto getCompanyById(Long companyId);

    List<CompanyRequestDto> getAllCompanies();
}
