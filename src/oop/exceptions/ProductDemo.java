package oop.exceptions;

public class ProductDemo {
    public static void main(String[] args) throws ProductException {
        try {
            Product product = new Product(1, "Laptop Lenovo Legion", -1000);
            if (product.getPrice() < 0) {
//                throw new ProductException("Cmimi negative!", product);
//                ProductException productException = new ProductException("Cmimi negative!", product);
//                throw productException;
                throw new NegativePriceException("cmimi negative!");
            }
            System.out.println("Produkti u shit! " + product);
        }
        catch (NegativePriceException ex) {
            throw new ProductException(ex.getMessage(), ex);
//            System.out.println(ex.getMessage());
//            System.out.println(ex.getProduct());
//            System.out.println("Data gabimit: " + ex.getExceptionDate());
        }
    }
}
