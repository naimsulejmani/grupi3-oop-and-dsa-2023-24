package oop.interfaces.db_example;

public class SQLException extends Exception {
    public SQLException() {
    }

    public SQLException(String message) {
        super(message);
    }

    public SQLException(String message, Throwable cause) {
        super(message, cause);
    }
}
