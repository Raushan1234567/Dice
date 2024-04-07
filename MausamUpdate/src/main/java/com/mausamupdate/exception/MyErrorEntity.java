package com.mausamupdate.exception;


import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyErrorEntity {

	private String Description;
	private String message;
	private LocalDateTime setDateTime;
	
}
