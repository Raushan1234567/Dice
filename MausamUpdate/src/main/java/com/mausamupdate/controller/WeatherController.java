package com.mausamupdate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mausamupdate.service.WeatherService;
import com.mausamupdate.wmodel.WeatherResponse;

@RestController
@RequestMapping("/weather")
public class WeatherController {
	
	@Autowired
	private WeatherService weatherService;
	
	
   @GetMapping("/updateByCity/{city}")
	public ResponseEntity<WeatherResponse> getWeatherSummaryByCityName(@PathVariable String city) {
		
		return new ResponseEntity<WeatherResponse>(weatherService.getWeatherResponce(city), HttpStatus.OK) ;
	
	}

	

}
