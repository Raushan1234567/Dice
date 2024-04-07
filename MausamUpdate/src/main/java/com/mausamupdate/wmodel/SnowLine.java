package com.mausamupdate.wmodel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SnowLine {
	
    private String avg;
	
	private String min;
	
	private String max;
	
	private String unit;
}


//"avg": null,
//"min": null,
//"max": null,
//"unit": "m"
