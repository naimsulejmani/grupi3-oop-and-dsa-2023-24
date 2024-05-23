package dsa.advanced_sort;

import dsa.shared.Helper;

import java.util.Arrays;

public class HeapSort {
    public void sort(int[] array) {
        // ndertimi i stogut
        // nese vargu i ka 100 elemente atehere me 50 here e krijon stogun
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            heapify(array, array.length, i);
        }
        System.out.println("Stogu: " + Arrays.toString(array));

        //cthurja e stogut
        for (int i = array.length - 1; i >= 0; i--) {
            Helper.swap(array, 0, i);
            heapify(array, i, 0);
        }
    }

    private void heapify(int[] array, int length, int currentIndex) {
        int largestIndex = currentIndex;
        int leftIndex = currentIndex * 2 + 1;
        int rightIndex = leftIndex + 1;

        if (leftIndex < length && array[leftIndex] > array[largestIndex]) {
            largestIndex = leftIndex;
        }
        if (rightIndex < length && array[rightIndex] > array[largestIndex]) {
            largestIndex = rightIndex;
        }

        if (largestIndex != currentIndex) {
            Helper.swap(array, currentIndex, largestIndex);
            heapify(array, length, largestIndex);
        }

    }
}










