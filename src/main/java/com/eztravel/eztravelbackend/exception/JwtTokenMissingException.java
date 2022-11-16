package com.eztravel.eztravelbackend.exception;


public class JwtTokenMissingException extends RuntimeException {
    public JwtTokenMissingException() {
    }

    public JwtTokenMissingException(String message) {
        super(message);
    }
}
