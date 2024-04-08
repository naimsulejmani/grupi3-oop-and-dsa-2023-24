package oop.enums.detyrat;

import java.util.Scanner;

public class DrinkDemo {
    public static void main(String[] args) {
        DrinkTypes type1 = DrinkTypes.COFFEE;
        System.out.println(type1);

        type1 = DrinkTypes.valueOf("TEA");
        System.out.println(type1);

        type1 = DrinkTypes.values()[3];
        System.out.println(type1);

        int index = 0;
        for (DrinkTypes drinkType : DrinkTypes.values()) {
            System.out.printf("Shtyp %d per %s %n", index++, drinkType);
        }
        Scanner reader = new Scanner(System.in);
        System.out.println("Zgjedh opsionin: ");
        int choice = reader.nextInt();
        DrinkTypes selectedDrink = DrinkTypes.values()[choice];
        System.out.println("Ju keni zgjedhur " + DrinkTypes.values()[choice]);

        switch (selectedDrink) {
            case COFFEE, TEA -> System.out.println("Pije te nxehta!!!!");
            case BEER, WINE -> System.out.println("Pije alkoholike!");
            default -> System.out.println("Pije per femije!");
        }


    }
}












