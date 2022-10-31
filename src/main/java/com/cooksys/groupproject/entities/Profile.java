package com.cooksys.groupproject.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@Data
@NoArgsConstructor
public class Profile {

    private String first;

    private String last;

    private String email;

    private String phone;

}
