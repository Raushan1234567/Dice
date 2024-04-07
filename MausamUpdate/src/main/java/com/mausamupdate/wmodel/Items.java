package com.mausamupdate.wmodel;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Items {
	
	private String date;
	
	private String dateWithTimezone;
	
	private String freshSnow;
	
	private String snowHeight;
	
	private Weather weather;
	
	private Prec prec;
	
	private String sunHours;
	
	private String rainHours;
	
	private Temperature temperature;
	
	private Wind wind;
	
	private Windchill windChill;
	
	private SnowLine snowLine;
	
	private Astronomy astronomy;
	
}


//"date": "2024-04-06",
//"dateWithTimezone": "2024-04-05T18:30:00Z",
//"freshSnow": null,
//"snowHeight": null,  "sunHours": 11,
//"rainHours": null,
