package com.cooksys.groupproject.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
public class AnnouncementResponseDto {

    private Timestamp posted;

    private String title;

    private String message;

    private CompanyResponseDto companyResponseDto;

    private UserResponseDto Author;

}