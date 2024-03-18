package dsa.recursion_algorithm;

public class CollatzSequence {
    public static void collatz(int n) {
        System.out.printf("%d ", n);
        if (n == 1) return; // Base case  - rasti per te cilin dime
        //se cka me bo
        if (n % 2 == 0) collatz(n / 2);
        else collatz(n * 3 + 1);
    }
    public static void main(String[] args) {
        collatz(97);
    }
}
