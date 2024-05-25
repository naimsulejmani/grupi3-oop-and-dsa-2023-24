package oop.inheritance.ushtrime4;

public class StoneCold implements Wrestler {

    private double price;

    public StoneCold() {
    }

    public StoneCold(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void paymentForWork(int hours) {
        System.out.printf("Stone will make $%.2f%n", hours * price);
    }

    @Override
    public void themeMusic() {
        System.out.println("Stone cold theme music");
    }

    @Override
    public void finisher() {
        System.out.println("Stone cold finisher");
    }
}
