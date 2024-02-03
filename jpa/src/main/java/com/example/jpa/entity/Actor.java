package com.example.jpa.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="actor")
public class Actor {
	
	@Id
	private int actor_id;	
	
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private Date lastUpdate;
	
}
