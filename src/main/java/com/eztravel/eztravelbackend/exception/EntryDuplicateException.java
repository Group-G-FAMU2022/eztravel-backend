package com.eztravel.eztravelbackend.exception;


public class EntryDuplicateException extends RuntimeException {
    public EntryDuplicateException() {
    }

    public EntryDuplicateException(String message) {
        super(message);
    }
}
