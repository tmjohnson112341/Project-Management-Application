package com.cooksys.groupproject.entities;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Announcements {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@CreationTimestamp
    private Timestamp date; 
	
	private String title;
	
	private String message;
	
	@ManyToOne
	private Company company;
	
	@ManyToOne
	private User user;

}
