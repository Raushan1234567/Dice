package com.mausamupdate.wmodel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Location {
	
	private String code;
	
	private String name;
	
	private String timezone;
	
	private Coordinates coordinates;

}

