package com.code.challenge.backend.calculator.domain;

public class ValidationException extends RuntimeException {

    public ValidationException(String message) {
        super(message);
    }
}
