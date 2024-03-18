package dsa.recursion_algorithm;

public class TowersOfHanoi {
    public static void towersOfHanoi(int n, char fromRod, char toRod, char auxRod) {
        if (n == 1) {
            System.out.printf("Move disk 1 from rod %c to rod %c%n", fromRod, toRod);
            return;
        }

        towersOfHanoi(n - 1, fromRod, auxRod, toRod);
        System.out.printf("Move disk %d from rod %c to rod %c%n", n, fromRod, toRod);
        towersOfHanoi(n - 1, auxRod, toRod, fromRod);
    }

    public static void main(String[] args) {
        towersOfHanoi(8,'S','D','I');
    }
}










