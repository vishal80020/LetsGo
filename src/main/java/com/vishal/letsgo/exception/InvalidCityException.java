package com.vishal.letsgo.exception;

public class InvalidCityException extends LetsGoException {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 * This exception is thrown from RegistrationService class with error message
	 * RegistrationService.INVALID_CITY if the given city is not matching the
	 * constraints given in the regular expression.
	 * 
	 *  
	 *  
	 */

	public InvalidCityException(String message) {
		super(message);
	}

}
