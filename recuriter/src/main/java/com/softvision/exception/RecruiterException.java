package com.softvision.exception;

public class RecruiterException extends Exception {
    private static final long serialVersionUID = 1L;
    private String errorMessage;

    public RecruiterException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public RecruiterException(String message, String errorMessage) {
        super(message);
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
