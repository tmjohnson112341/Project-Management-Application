package com.cooksys.groupproject.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProjectRequestDto {

    private String name;

    private String description;
}