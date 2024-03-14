package dsa.recursion_algorithm;

public class Binary {
    public static String convert(int n) {
        if (n == 1) return "1";
        return convert(n / 2) + (n % 2);
    }
    public static void main(String[] args) {
        System.out.println(convert(6));
        System.out.println(convert(37));
        System.out.println(convert(999999));
    }
}












