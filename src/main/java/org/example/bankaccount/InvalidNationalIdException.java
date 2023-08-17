package org.example.bankaccount;

public class InvalidNationalIdException extends RuntimeException {
    public InvalidNationalIdException(String message) {
        super(message);
    }
}
