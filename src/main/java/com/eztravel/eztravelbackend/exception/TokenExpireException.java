package com.eztravel.eztravelbackend.exception;


public class TokenExpireException extends RuntimeException {
    public TokenExpireException(String message) {
        super(message);
    }
}
