package oop.exceptions;

import java.io.IOException;

public class Example1 {
    public static void main(String[] args) {
        try {
            doThings();
        } catch (IOException e) {
            System.out.println("IO Exception");
        } catch (ProductException e) {
            System.out.println("Product Exception");
        } catch (Exception ex) {
            System.out.println("Other exception");
        }
    }

    public static void doThings() throws IOException, ProductException {
        double rnd = Math.random();

        if (rnd < 0.34) throw new IOException();
        else if (rnd < 0.67) throw new ProductException();
        else throw new NullPointerException();
    }
}





