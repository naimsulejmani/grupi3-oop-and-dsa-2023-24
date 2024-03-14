package dsa.recursion_algorithm;

public class Factorial {

    public static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
/*
    factorial(4)

    4 * factorial(4-1=3)
    3 * factorial(3-1=2)
    2 * factorial(2-1=1)
    1 => 1


 */
    public static void main(String[] args) {
//        System.out.println(factorial(6));
//        System.out.println(factorial(7));
    }


}









