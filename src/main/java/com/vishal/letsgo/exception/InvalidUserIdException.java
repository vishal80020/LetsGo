package com.vishal.letsgo.exception;

public class InvalidUserIdException extends LetsGoException {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 * This exception is thrown from RegistrationService class with error message
	 * RegistrationService.INVALID_USER_ID if the given userId is not matching the
	 * constraints given in the regular expression.
	 * 
	 *  
	 *  
	 */
	
	public InvalidUserIdException(String message) {
		super(message);
	}
}
