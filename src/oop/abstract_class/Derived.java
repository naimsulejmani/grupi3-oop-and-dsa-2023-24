package oop.abstract_class;

public class Derived extends Base {
    public Derived() {
        System.out.println("Derived constructor");
    }

    @Override
    public void fun() {
        System.out.println("Fun method called!");
    }
}
