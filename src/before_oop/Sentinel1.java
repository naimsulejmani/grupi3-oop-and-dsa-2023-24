package before_oop;

import java.util.Scanner;

public class Sentinel1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word (or \"quit\" to exit): ");
        String text = reader.nextLine();

        int sum = 0;
        while (!text.equalsIgnoreCase("quit")) {
            sum += text.length();
            System.out.println("Type a word (or \"quit\" to exit): ");
            text = reader.nextLine();
        }
        System.out.printf("You typed a total of %d characters!", sum);
    }
}











