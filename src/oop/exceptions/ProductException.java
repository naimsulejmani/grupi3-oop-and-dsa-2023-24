package oop.exceptions;

import java.time.LocalDateTime;

public class ProductException extends Exception {

    private Product product;
    private LocalDateTime exceptionDate = LocalDateTime.now();


    public ProductException(Product product) {
//        super();
        this.product = product;
    }

    public ProductException(String message, Product product) {
        super(message);
        this.product = product;
    }

    public ProductException() {
    }

    public ProductException(String message) {
        super(message);
    }

    public ProductException(String message, Throwable cause) {
        super(message, cause);
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public LocalDateTime getExceptionDate() {
        return exceptionDate;
    }
}
