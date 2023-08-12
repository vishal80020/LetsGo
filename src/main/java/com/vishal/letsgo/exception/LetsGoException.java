package com.vishal.letsgo.exception;

/**
 * All other user defined exception classed will inherit this exception class.
 * 
 */
public class LetsGoException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public LetsGoException(String message) {
		super(message);
	}
	

}
