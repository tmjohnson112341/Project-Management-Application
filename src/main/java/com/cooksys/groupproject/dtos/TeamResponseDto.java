package com.cooksys.groupproject.dtos;

import com.cooksys.groupproject.entities.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class TeamResponseDto {

    private Long id;

    private String teamName;

    private String teamDescription;

    private CompanyRequestDto teamCompany;

    private List<User> userList;

}