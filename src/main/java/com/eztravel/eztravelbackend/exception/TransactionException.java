package com.eztravel.eztravelbackend.exception;


public class TransactionException extends RuntimeException {
    public TransactionException(String message) {
        super(message);
    }
}
