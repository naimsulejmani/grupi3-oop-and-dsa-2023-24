package dsa.shared;

public class Helper {
    public static void swap(int[] array, int from, int to) {
        int temp = array[from]; // ruaje vleren e elementit from ne temp
        array[from] = array[to]; // ne indeksin from ruaje vleren a array to
        array[to] = temp; // ne array to vendose vleren e temp (array from qe ka qene me heret)
    }
}
