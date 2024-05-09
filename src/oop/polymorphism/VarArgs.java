package oop.polymorphism;

public class VarArgs {
    public static void main(String[] args) {
//        int sum = add(2, 3);
//        sum = add(1, 2, 3);
//        sum = add(new int[]{1, 11, 100, 80});

        System.out.println(add());
        System.out.println(add(88, 12));
        System.out.println(add(23, 23, 44));
        System.out.println(add(3, 4, 5, 6, 7, 8, 3, 4, 5, 3, 3, 4, 5, 6, 4, 32, 23, 123));

        System.out.println(add(22.2, 22.2));
        System.out.println(add(22.2f, 23.2f));
        System.out.println(add(23L, 29L));
//        System.out.println(add(23L, 29L,10L));
    }

    private static double add(double a, double b) {
        return a + b;
    }

    private static int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

//    private static int add(int a, int b) {
//        return a + b;
//    }
//
//    private static int add(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    private static int add(int[] array) {
//        int sum = 0;
//        for (int number : array) {
//            sum += number;
//        }
//        return sum;
//    }
}
