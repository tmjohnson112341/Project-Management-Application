package com.cooksys.groupproject.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class TeamRequestDto {

    private String teamName;

    private String teamDescription;

    private Long companyID;

    private List<String> usernames;

}