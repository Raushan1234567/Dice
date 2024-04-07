package com.mausamupdate.wmodel;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prec {
	
	private String sum;
	
	private String probability;
	
	private String sumAsRain;
	
//	@JsonProperty("classs")
	private int classs;

}

//"sum": 0,
//"probability": 0,
//"sumAsRain": null,
//"class": 0
