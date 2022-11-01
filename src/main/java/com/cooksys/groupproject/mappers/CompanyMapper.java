package com.cooksys.groupproject.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.cooksys.groupproject.dtos.CompanyRequestDto;
import com.cooksys.groupproject.dtos.CompanyResponseDto;
import com.cooksys.groupproject.entities.Company;

@Mapper(componentModel = "spring")
public interface CompanyMapper {

	Company requestDtoToEntity(CompanyRequestDto companyRequestDto);
	
	CompanyResponseDto entityToResponseDto(Company company);
	
	List<CompanyResponseDto> entitiesToResponseDtos(List<Company> companys);
}
