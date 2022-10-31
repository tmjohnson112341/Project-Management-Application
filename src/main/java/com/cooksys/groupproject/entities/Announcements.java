package com.cooksys.groupproject.entities;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Profile;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Announcements {
	
	@Id
	@GeneratedValue
	private long id;



}
