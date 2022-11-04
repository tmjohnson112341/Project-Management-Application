package com.cooksys.groupproject.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cooksys.groupproject.dtos.CompanyResponseDto;
import com.cooksys.groupproject.entities.Company;
import com.cooksys.groupproject.exceptions.NotFoundException;
import com.cooksys.groupproject.mappers.CompanyMapper;
import com.cooksys.groupproject.repositories.CompanyRepository;
import com.cooksys.groupproject.services.CompanyService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService{

    private final CompanyRepository companyRepository;
    private final CompanyMapper companyMapper;

    @Override
    public CompanyResponseDto getCompanyById(Long id) {
        Optional<Company> company = companyRepository.findById(id);
        if (company.isEmpty()) {
            throw new NotFoundException("That company does not exist");
        }
        return companyMapper.entityToResponseDto(company.get());
    }

    @Override
    public List<CompanyResponseDto> getAllCompanies() {
        return companyMapper.entitiesToResponseDtos(companyRepository.findAll());

    }

}
