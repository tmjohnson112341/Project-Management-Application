package com.cooksys.groupproject.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserRequestDto {
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String phone;

    private Boolean Active;

    private String status;

    private TeamDto team;

    private CompanyDto company;

    private CredentialsDto credentials;