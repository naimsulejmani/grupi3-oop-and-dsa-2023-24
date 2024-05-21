package oop.exceptions.ushtrime;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Product {
    private int id;
    private String name;
    private BigDecimal price;
    private LocalDate bestBefore;

    public Product() {
    }

    public Product(int id, String name, BigDecimal price, LocalDate bestBefore)
            throws ProductException, IllegalArgumentException {
        setId(id);
        this.name = name;
        setPrice(price);
        setBestBefore(bestBefore);
    }

    public int getId() {
        return id;
    }

    //setId(-10);
    public void setId(int id) throws IllegalArgumentException {
        if (id < 0)
            throw new IllegalArgumentException("Nuk lejohet vlere negative te ID-se");
//        id = 1_000_000 / id;
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

    public void setPrice(BigDecimal price) throws ProductException {
        if (price.compareTo(BigDecimal.ZERO) < 0)
            throw new ProductException("Nuk lejohet cmimi negative!");
        this.price = price;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    public void setBestBefore(LocalDate bestBefore) throws ProductException {
        if (bestBefore.isBefore(LocalDate.now()))
            throw new ProductException("Nuk mundesh me kriju produkt te skaduar!");

        this.bestBefore = bestBefore;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", bestBefore=" + bestBefore +
                '}';
    }
}















