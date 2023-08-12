package com.vishal.letsgo.exception;

public class InvalidEmailException extends LetsGoException {
	
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * This exception is thrown from RegistrationService class with error message
	 * RegistrationService.INVALID_EMAIL if the given email is not matching the
	 * constraints given in the regular expression.
	 * 
	 *  
	 *  
	 */
	public InvalidEmailException(String message) {
		super(message);
	}
}
