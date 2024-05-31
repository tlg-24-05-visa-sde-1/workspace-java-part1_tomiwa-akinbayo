package com.hr;

/*
This is a more HR exception, higher level
 */
public class WorkException extends Exception {
    public WorkException() {
    }

    public WorkException(String message) {
        super(message);
    }

    public WorkException(String message, Throwable cause) {
        super(message, cause);
    }

    public WorkException(Throwable cause) {
        super(cause);
    }
}
