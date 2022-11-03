package com.cooksys.groupproject.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;


    @Data
    @NoArgsConstructor
    public class ProjectResponseDto {

        private Long id;

        private String name;

        private String description;

        private Boolean active;

        private TeamResponseDto team;
    }
