package com.cooksys.groupproject.mappers;

import com.cooksys.groupproject.dtos.CredentialsDto;
import com.cooksys.groupproject.entities.Credentials;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CredentialsMapper {

    Credentials dtoToEntity(CredentialsDto credentialsDto);
}