package dsa.recursion_algorithm;

public class SumNumber {
    public static int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sum(10));
        System.out.println(sum(9));
        System.out.println(sum(8));
    }
}
