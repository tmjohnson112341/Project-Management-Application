package com.cooksys.groupproject.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cooksys.groupproject.dtos.CompanyRequestDto;
import com.cooksys.groupproject.services.CompanyService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService{@Override
	public CompanyRequestDto getCompanyById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CompanyRequestDto> getAllCompanies() {
		// TODO Auto-generated method stub
		return null;
	}

}
