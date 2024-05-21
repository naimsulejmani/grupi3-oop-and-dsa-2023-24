package oop.exceptions.ushtrime;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProductDemo {
    public static void main(String[] args) {
        Product product = null;
        try {
            product = new Product(0,
                    "Jogobella",
                    BigDecimal.valueOf(0.70),
                    LocalDate.now().plusDays(10));
        } catch (ProductException | IllegalArgumentException ex) {
            System.out.println("Gabim: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Gabim i pamenaxhueshem nga programeri");
            System.out.println("Gabim: "+ex.getMessage());
        }
        finally {
            System.out.println("Gjithmon ekzekutohem!!!");
        }

        if (product != null) {
            System.out.println(product);
        } else {
            System.out.println("Produkti nuk eshte krijuar!");
        }

    }
}

