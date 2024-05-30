package oop.generics;

import oop.interfaces.ushtrime3.Player;

import java.time.LocalDate;

public class GenericMethods {
    public static void main(String[] args) {

        String middleString = getMiddle("Naim", "Filan", "Fistek");
        System.out.println("Middle String = " + middleString);

        double middleDouble = getMiddle(12.2, 2.0, 33.0, 22.2);
        System.out.println(middleDouble);

        middleDouble = getMiddle(1, 2, 3, 4, 5);
        System.out.println(middleDouble);

        String text = concatenate(
                "Naim", "Filan", "Fistek", 1, 2, 3, LocalDate.now(), 2F, 1.2);

        int min = min(20, 23, 33, 100, 1, 0);
        System.out.println("min = " + min);

        NodeInt minNode = min(new NodeInt(), new NodeInt());
    }

    public static <T> T getMiddle(T... args) {
        return args[(args.length - 1) / 2];
    }

    public static <T> String concatenate(T... args) {
        StringBuilder result = new StringBuilder("");
        for (T arg : args) {
            result.append(arg);
        }
        return result.toString();
    }

    public static <T, U> U getTest(T t, U u) {
        if (t.hashCode() <= u.hashCode()) return null;
        return u;
    }


    public static <T extends Comparable<T>> T min(T... args) {
        if (args.length == 0)
            throw new IllegalArgumentException("No arguments provided!");
        T min = args[0];

        for (int i = 1; i < args.length; i++) {
            if (min.compareTo(args[i]) > 0) {
                min = args[i];
            }
        }
        return min;
    }

    public static <T extends Comparable<T>> T max(T... args) {
        if(args.length == 0){
            throw new IllegalArgumentException("No arguments provided!");
        }
        T max = args[0];
        for (int i = 1; i < args.length; i++) {
            if (max.compareTo(args[i]) < 0) {
                max = args[i];
            }
        }
        return max;
    }

}








