package com.ecommerce.resources.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ecommerce.services.exception.ObjectNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {
	// we 're using this Exception class to formating  us informative message
	
	//this method used by @Controller Advice requires this exception and this HttpServletRequest object
	
	/*When the Object not Found Exception  be throw the @ExceptionHandler indicates to Spring, using 
	ResorceExceptionHandler to manage this exception*/
	@ExceptionHandler(ObjectNotFoundException.class)//indicates Exception Handler the type of exception handled
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e, HttpServletRequest request )
	{
		StandardError err = new StandardError(HttpStatus.NOT_FOUND.value(), e.getMessage(), System.currentTimeMillis() ); 
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
	}
}
