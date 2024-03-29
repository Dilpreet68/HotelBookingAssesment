package com.cg.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cg.exception.ApplicationException;

@ControllerAdvice
public class ApplicationExceptionHandler {
	@ExceptionHandler({ApplicationException.class})
	public ResponseEntity<String> handleError(ApplicationException exception) {
		return new ResponseEntity<String>(exception.getMessage(), HttpStatus.NOT_FOUND);
	}
}
