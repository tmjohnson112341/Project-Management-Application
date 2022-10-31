package com.cooksys.groupproject.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserResponseDto {
    private Long id;

    private String username;

    private ProfileDto profile;

    private Boolean Active;

    private Boolean Admin;

    private String status;

    private TeamRequestDto teamRequestDto;

    private CompanyRequestDto companyRequestDto;
}