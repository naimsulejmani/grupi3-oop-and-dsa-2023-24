package oop.before_oop;

import java.util.Scanner;

public class TaskPerPune {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Numri: ");
        long number = reader.nextLong();

        long sum = 0;

//        while (number > 0) {
//            number /= 10; // hjeka njeshat
//            long leftOver = number % 10; // merre mbetjen (dhjeshat)
//
//            if (leftOver % 2 == 0)
//                sum += leftOver;
//
//            number /= 10;
//        }
//        System.out.printf("Shuma = " + sum);

//        while (number > 0) {
//            long leftOver = (number % 100) / 10;
//            if (leftOver % 2 == 0)
//                sum += leftOver;
//            number /= 100;
//        }

        String strNumber = String.valueOf(number); // number + "";

        for (int i = strNumber.length() - 2; i > 0; i -= 2) {
            long leftOver = Long.parseLong(strNumber.charAt(i) + "");
            if (leftOver % 2 == 0)
                sum += leftOver;
        }
        System.out.println("Shuma = " + sum);

    }
}








