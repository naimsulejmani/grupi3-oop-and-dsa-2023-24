

package oop.intro_class_object.summary;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Product {
    //variablat instance
    private int id;
    private String name;
    private BigDecimal price = BigDecimal.ZERO;
    private LocalDate bestBefore = LocalDate.now().plusDays(7);

    public Product(int id, String name, BigDecimal price, LocalDate bestBefore) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.bestBefore = bestBefore;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    public void setBestBefore(LocalDate bestBefore) {
        this.bestBefore = bestBefore;
    }
}














