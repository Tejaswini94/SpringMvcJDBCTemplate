package com.spring.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(value=HttpStatus.BAD_REQUEST, reason="No such Contact")  // 404
public class ContactNotFoundException extends RuntimeException {

	public ContactNotFoundException(String message){
		super(message);
	}
}
