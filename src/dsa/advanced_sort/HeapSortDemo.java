package dsa.advanced_sort;

import dsa.shared.ArrayGenerator;

import java.util.Arrays;

public class HeapSortDemo {
    public static void main(String[] args) {
        int[] arrays = ArrayGenerator.generateRandomArray(10, 1, 100);
        System.out.println("Pa sortuar: " + Arrays.toString(arrays));
        new HeapSort().sort(arrays); //anonymous object
        System.out.println("Te sortuar: " + Arrays.toString(arrays));
    }
}
