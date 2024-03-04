package before_oop;

import java.util.Scanner;

public class DeceptiveProblem {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("jepni tekstin: ");
        String tekst = reader.nextLine();

        System.out.print(tekst.charAt(0));
        for (int i = 1; i < tekst.length(); i++) {
            System.out.print("," + tekst.charAt(i));
        }


        System.out.println("\n");
        for (int i = 0; i < tekst.length() - 1; i++) {
            System.out.print(tekst.charAt(i) + ",");
        }
        System.out.print(tekst.charAt(tekst.length() - 1));
    }
}












