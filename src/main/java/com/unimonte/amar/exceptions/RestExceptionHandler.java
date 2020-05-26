package com.unimonte.amar.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {

	// add an exception handler for CustomerNotFoundException

	@ExceptionHandler
	public ResponseEntity<ErrorResponse> handlerException(NotFoundException exc) {//vai tratar o erro de id n�o encontrado

		// create CustomerErrorResponse

		ErrorResponse error = new ErrorResponse(HttpStatus.NOT_FOUND.value(), exc.getMessage(),
				System.currentTimeMillis());// esta passando os dados do erro

		// return ResponseEntity

		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);// vai passar o erro pelo corpo da requisi��o

	}

	// add another exception handler ... to catch any exception(catch all)

	@ExceptionHandler
	public ResponseEntity<ErrorResponse> handlerException(Exception exc) {//vai trtar o erro de bad request, quando voc� passa um dado incompat�vel

		// create CustomerErrorResponse

		ErrorResponse error = new ErrorResponse(HttpStatus.BAD_REQUEST.value(), exc.getMessage(),
				System.currentTimeMillis());// esta passando os dados do erro

		// return ResponseEntity

		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);// vai passar o erro pelo corpo da requisi��o

	}

}
