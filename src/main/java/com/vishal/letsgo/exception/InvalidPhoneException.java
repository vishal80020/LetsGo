package com.vishal.letsgo.exception;

public class InvalidPhoneException extends LetsGoException{
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 * This exception is thrown from RegistrationService class with error message
	 * RegistrationService.INVALID_PHONE_NUMBER if the given phone number is not matching the
	 * constraints given in the regular expression.
	 * 
	 *  
	 *  
	 */
	
	public InvalidPhoneException(String message) {
		super(message);
	}

}
