package dsa.elementary_sorts;

import dsa.shared.ArrayGenerator;

import java.util.Arrays;

public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] array = ArrayGenerator.generateRandomArray(20, 0, 100);
        System.out.println(Arrays.toString(array));

        BubbleSort.bubbleSort(array);

        System.out.println(Arrays.toString(array));
        System.out.println("1000000 EUR");

    }
}








