package dsa.elementary_sorts;

import dsa.shared.ArrayGenerator;

import java.util.Arrays;

public class InsertionSortDemo {
    public static void main(String[] args) {
        //int[] array = {1,88,77,12,37,43,22,34};
        int[] array = ArrayGenerator.generateRandomArray(15, 0, 100);
        System.out.println("Vargu i pasortuar");
        System.out.println(Arrays.toString(array));
        InsertionSort.insertionSort(array);
        System.out.println("Vargu i sortuar");
        System.out.println(Arrays.toString(array));
    }
}










