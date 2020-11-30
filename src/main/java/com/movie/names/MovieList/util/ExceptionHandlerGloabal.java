package com.movie.names.MovieList.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerGloabal extends ResponseEntityExceptionHandler {

	@ExceptionHandler(ArithmeticException.class)
	public void handleArithmeticException(ArithmeticException a, WebRequest req) {
		System.out.println("Arithmetic expection");
	}

	@ExceptionHandler(MovieNotFoundException.class)
	public ResponseEntity<Object> handleArithmeticException(MovieNotFoundException a, WebRequest req) {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
}
