package com.cooksys.groupproject.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
public class AnnouncementResponseDto {
	
	private Long id;
	
	private java.sql.Date date;
	
    private String title;

    private String message;

    private CompanyResponseDto company;

    private UserResponseDto user;

}