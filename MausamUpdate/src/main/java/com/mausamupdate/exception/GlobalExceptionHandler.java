package com.mausamupdate.exception;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;





@RestControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	ResponseEntity<MyErrorEntity> d(MethodArgumentNotValidException er){
		MyErrorEntity re=new MyErrorEntity();
	re.setSetDateTime(LocalDateTime.now());
		re.setMessage("validation exception");
		
		 List<ObjectError> o=er.getBindingResult().getAllErrors();
		 List<String> o1=MethodArgumentNotValidException.errorsToStringList(o);
		 
		 re.setDescription(String.join(", ", o1));
		 
		return new ResponseEntity<MyErrorEntity>(re , HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> GeneralExceptionHandler(Exception se){
		return new ResponseEntity<>(se.getMessage() , HttpStatus.BAD_REQUEST) ;
	}
	
	
	
	
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<String> NoHandelerExceptionHandler(NoHandlerFoundException se){
		return new ResponseEntity<>("There is no handler for this endpoint" , HttpStatus.BAD_REQUEST) ;
	}
	
	

}
