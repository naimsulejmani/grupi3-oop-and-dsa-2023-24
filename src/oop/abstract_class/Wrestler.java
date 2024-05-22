package oop.abstract_class;

public abstract class Wrestler {
    private double price = 250.00;

    public void paymentForWork(int hours) {
        System.out.printf("The wrestler will make: $%.2f%n", hours * price);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void themeMusic();

    public abstract void finisher();
}
