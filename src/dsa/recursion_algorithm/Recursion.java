package dsa.recursion_algorithm;

import java.util.Scanner;

public class Recursion {
    static Scanner reader = new Scanner(System.in);

    public static void pyetje(String aPoKupton) {
        if (aPoKupton.equalsIgnoreCase("PO")) {
            System.out.println("Super me ne fund!");
            return;
        }
        System.out.println("A po kupton! ");
        pyetje(reader.nextLine());
    }
    public static void main(String[] args) {
        pyetje("");
    }
}





