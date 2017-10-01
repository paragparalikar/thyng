package com.thyng.model;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class Coordinates {

	private double lattitude;
	
	private double longitude;
	
	private double altitude;
	
}
