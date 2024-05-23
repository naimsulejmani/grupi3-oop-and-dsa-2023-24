package oop.interfaces;

public class MilkProductDemo {
    public static void main(String[] args) {
        Perishable perishable = new MilkProduct();
        System.out.println(perishable.isPerished());
        perishable.perish();
        System.out.println(perishable.isPerished());

    }
}
