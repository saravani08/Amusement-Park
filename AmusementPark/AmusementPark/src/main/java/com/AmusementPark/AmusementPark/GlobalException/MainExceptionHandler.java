package com.AmusementPark.AmusementPark.GlobalException;
import com.AmusementPark.AmusementPark.Entity.ErrorResponse;
import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class MainExceptionHandler {
	
	@ExceptionHandler(ActivityAlreadyExistsException.class)
	
	public ResponseEntity<ErrorResponse> handleException(ActivityAlreadyExistsException exception){
		
		ErrorResponse error = new ErrorResponse();
		error.setStatusCode(HttpStatus.BAD_REQUEST.value());
		error.setMessage(exception.getMessage()); 
		error.setTimeStamp(LocalDateTime.now()); 
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST); 
	}
	
	@ExceptionHandler(ActivityNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleException(ActivityNotFoundException exception){
		
		ErrorResponse error = new ErrorResponse();
		error.setStatusCode(HttpStatus.NOT_FOUND.value());
		error.setMessage(exception.getMessage()); 
		error.setTimeStamp(LocalDateTime.now()); 
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND); 
	}

}

