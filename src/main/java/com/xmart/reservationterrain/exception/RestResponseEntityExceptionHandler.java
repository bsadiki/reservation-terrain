package com.xmart.reservationterrain.exception;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(Exception.class)
    protected ResponseEntity<Object> handleNotFound(Exception ex, WebRequest request){
        String bodyOfResponse=ex.getMessage();
        return handleExceptionInternal(ex,bodyOfResponse,
                new HttpHeaders(), HttpStatus.BAD_REQUEST,request);
    }
}
