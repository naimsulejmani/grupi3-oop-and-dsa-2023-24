package oop.polymorphism;

public class InstanceInitializer {
    //instance initializer block
    {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
    }

    public InstanceInitializer() {
        System.out.println("This is the last that will executed!");
    }

    //instance initializer block
    {
        System.out.println("This is second that will executed!");
    }
}





