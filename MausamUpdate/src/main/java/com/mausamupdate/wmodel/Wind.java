package com.mausamupdate.wmodel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Wind {
	
	private String unit;
	
	private String direction;
	
	private String text;
	
	private String avg;
	
	private String min;
	
	private String max;
	
	private Gusts gust;
	
	private String significationWind;
	

}

//"unit": "km/h",
//"direction": "Nordwestwind",
//"text": "NW",
//"avg": null,
//"min": 2,
//"max": 13,
//"gusts": {
//    "value": null,
//    "text": null
//},
//"significationWind": false