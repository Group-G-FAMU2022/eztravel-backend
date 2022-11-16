package com.eztravel.eztravelbackend.exception;


public class EntryNotFoundException extends RuntimeException {
    public EntryNotFoundException() {
    }

    public EntryNotFoundException(String message) {
        super(message);
    }
}
