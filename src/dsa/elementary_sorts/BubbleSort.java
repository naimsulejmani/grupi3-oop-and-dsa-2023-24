package dsa.elementary_sorts;

public class BubbleSort {

    public static void bubbleSort(int[] array) {
        boolean swapped = true;
        for (int iPass = 0; iPass < array.length - 1 && swapped; iPass++) {
            swapped = false;
            for (int i = 0; i < array.length - 1 - iPass; i++) {
                //shko prej elementit te pare deri tek elementi i parafundit!
                if (array[i] > array[i + 1]) {
                    //krahaso elementin ku je me elementin vijues
                    int temp = array[i]; // ruaje elementin current ne temp
                    array[i] = array[i + 1]; // mbishkruje elementin current me vijuesin
                    array[i + 1] = temp; // mbishkruje vijuesin me temp
                    swapped = true;
                }
            }
        }
    }
}



















