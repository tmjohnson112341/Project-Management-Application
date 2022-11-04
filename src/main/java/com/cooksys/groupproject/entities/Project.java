package com.cooksys.groupproject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Project {
	
	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private String description;

	private boolean active;
	
	@ManyToOne
	private Team team;

}