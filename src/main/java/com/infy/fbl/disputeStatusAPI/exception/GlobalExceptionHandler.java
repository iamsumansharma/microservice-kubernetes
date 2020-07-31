package com.infy.fbl.disputeStatusAPI.exception;

import com.infy.fbl.disputeStatusAPI.util.ApplicationConstants;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> resourceNotFoundException(ResourceNotFoundException ex, WebRequest request) {
        ErrorDetails errorDetails = new ErrorDetails(ApplicationConstants.CODE, ex.getMessage(), ApplicationConstants.SUCCESS);
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }
}
