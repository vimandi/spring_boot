package com.example.jpa.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="city")
public class City {

	@Id
	private int cityId;
	@Column
	private String city;
	
	
	@ManyToOne
	@JoinColumn(name="country_id", referencedColumnName = "countryId")
	private Country country;
	
	@Column
	private Date lastUpdate;
	
}
