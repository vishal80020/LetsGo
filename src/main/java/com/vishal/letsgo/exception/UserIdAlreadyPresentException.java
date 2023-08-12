package com.vishal.letsgo.exception;

/**
 * If the given userId is present then this exception will be thrown
 */
public class UserIdAlreadyPresentException extends LetsGoException {
    private static final long serialVersionUID = 1L;

    public UserIdAlreadyPresentException(String message) {
        super(message);
    }

}
