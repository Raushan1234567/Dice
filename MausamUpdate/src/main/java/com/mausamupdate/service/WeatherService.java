package com.mausamupdate.service;

import com.mausamupdate.wmodel.WeatherResponse;

public interface WeatherService {
	
	public WeatherResponse getWeatherResponce(String cityName);

}
