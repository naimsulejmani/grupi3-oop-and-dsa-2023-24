package dsa.adts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double hyrjet = reader.nextDouble();
        double daljet = reader.nextDouble();

        double rezultati = kalkuloFormulen(hyrjet, daljet);
        System.out.println("Rezultati =" + rezultati);
    }

    private static double kalkuloFormulen(double hyrjet, double daljet) {
        return Math.sqrt(Math.pow(hyrjet, 2) + Math.pow(daljet, 2)) - 300;
    }
}
