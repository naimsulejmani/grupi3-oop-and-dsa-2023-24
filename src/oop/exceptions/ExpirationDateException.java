package oop.exceptions;

// UNCHECKED EXCEPTION
public class ExpirationDateException extends RuntimeException {
    public ExpirationDateException() {
    }

    public ExpirationDateException(String message) {
        super(message);
    }

    public ExpirationDateException(String message, Throwable cause) {
        super(message, cause);
    }
}
