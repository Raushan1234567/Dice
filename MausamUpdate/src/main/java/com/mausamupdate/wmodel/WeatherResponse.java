package com.mausamupdate.wmodel;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherResponse {
	
	@JsonProperty("location")
	private Location locaion;
	
	@JsonProperty("forecast")
	private ForeCast forCast;

}
