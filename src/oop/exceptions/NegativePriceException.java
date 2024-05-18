package oop.exceptions;

//CHECKED EXCEPTION
public class NegativePriceException extends Exception {
//    private int id;
//    private String name;
    public NegativePriceException() {
    }

    public NegativePriceException(String message) {
        super(message);
    }

    public NegativePriceException(String message, Throwable cause) {
        super(message, cause);
    }
}
