package com.cooksys.groupproject.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Company {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String name;

	private String description;
	
	@OneToMany(mappedBy="company")
	private List<User> users;
	
	@OneToMany(mappedBy="company")
	private List<Team> teams;
	
	@OneToMany(mappedBy="company")
	private List<Announcements> announcements;

}
