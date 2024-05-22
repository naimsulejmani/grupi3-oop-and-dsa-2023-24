package oop.abstract_class;

public class WrestlerDemo {
    public static void main(String[] args) {
        Wrestler wrestler = new Kane();
        wrestler.themeMusic();
        wrestler.paymentForWork(10);
        wrestler.finisher();
    }
}
