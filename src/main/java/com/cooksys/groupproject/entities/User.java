package com.cooksys.groupproject.entities;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	@Id
	@GeneratedValue
	private long id;

	@Embedded
	private Credentials credentials;

	private String firstName;

	private String lastName;

	private String email;

	private String phone;

	private boolean active;

	private boolean admin;

	private String status;

	private Long team;

	private Long company;

}
