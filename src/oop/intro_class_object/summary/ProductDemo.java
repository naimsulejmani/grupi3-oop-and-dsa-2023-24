package oop.intro_class_object.summary;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProductDemo {
    public static void main(String[] args) {
        Product p1 = new Product(1,
                "Monte Coko",
                BigDecimal.valueOf(0.50),
                LocalDate.now().plusDays(1));

        Product p2 = new Product(2, "Laptop Lenovo X1 Carbon",
                BigDecimal.valueOf(2500),
                LocalDate.now().plusYears(3));

        Product p3 = p2;

        p3.setPrice(BigDecimal.valueOf(1));
        System.out.println(p2.getPrice());
//        p3 = p1;
//        p3 = new Product();

        int x = 10;
        int y = x;
        x = 20;

    }
}










