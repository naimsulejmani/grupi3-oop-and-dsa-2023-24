package oop.composition_aggregation.lists;

import dsa.shared.ArrayGenerator;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[] randomArray = ArrayGenerator.generateRandomArray(10, 0, 100);

        System.out.println(Arrays.toString(randomArray));
        Arrays.sort(randomArray);
        System.out.println(Arrays.toString(randomArray));

        int index = Arrays.binarySearch(randomArray, 50);

        System.out.println(index);
    }
}
