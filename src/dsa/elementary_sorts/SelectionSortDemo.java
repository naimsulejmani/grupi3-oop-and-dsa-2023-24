package dsa.elementary_sorts;

import dsa.shared.ArrayGenerator;

import java.util.Arrays;

public class SelectionSortDemo {
    public static void main(String[] args) {
        int[] array = ArrayGenerator.generateRandomArray(15, 0, 100);
        System.out.println("Vargu i pasortuar:");
        System.out.println(Arrays.toString(array));
        System.out.println("Vargu i sortuar:");
        SelectionSort.selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}







