package com.cooksys.groupproject.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TeamResponseDto {

    private Long id;

    private String name;

    private String description;

    private CompanyRequestDto company;

}