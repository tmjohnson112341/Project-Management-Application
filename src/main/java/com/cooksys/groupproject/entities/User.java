package com.cooksys.groupproject.entities;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="user_table")
public class User {
	
	@Id
	@GeneratedValue
	private long id;

	@Embedded
	private Credentials credentials;

	private String first;

	private String last;

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
