package com.cooksys.groupproject.entities;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
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
	
	@ManyToOne
	private Team team;
	
	@ManyToOne
	private Company company;
	
	@OneToMany(mappedBy="user")
	private List<Announcements> announcements; 

}
