package oop.logging;

import oop.exceptions.ushtrime.Product;
import oop.exceptions.ushtrime.ProductException;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestLogger {
    // Java REFLECTION
    //"oop.logging.TestLogger"
    private static final Logger logger = Logger.getLogger(TestLogger.class.getName());

    public static void main(String[] args) {
        Product product = null;
        logger.setLevel(Level.INFO);
        try {
            product = new Product(10,
                    "Crossant Me Qoko",
                    BigDecimal.valueOf(10),
                    LocalDate.now());

        } catch (ProductException | IllegalArgumentException ex) {
            logger.log(Level.WARNING, ex.getMessage(), ex);
        } catch (Exception ex) {
            logger.log(Level.SEVERE, ex.getMessage(), ex);
        }

        if (product != null) {
            logger.log(Level.INFO, "U kriju produkti!");
            System.out.println(product);
        } else {
            logger.info("Produkti nuk eshte krijuar!");
        }
    }
}















