package dsa.elementary_sorts;

import dsa.shared.Helper;

public class SelectionSort {
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            // Gjej minimumin ne varg prej indeksit i dhe tutje!
            int minIndex = minimum(array, i);

            //nese i eshte e ndryshsme prej indeksit minimal te gjetur
            if (i != minIndex) {
                Helper.swap(array, i, minIndex);
            }
        }
    }

    private static int minimum(int[] array, int startIndex) {
        int minIndex = startIndex;

        for (int i = startIndex + 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}













