package dsa.elementary_sorts;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        for (int pointer = 1; pointer < array.length; pointer++) {
            int current = array[pointer];
            int position = pointer;
            //perderisa nuk jemi mri ne fillim te vargut
            //dhe perderisa elementi vijues eshte me i madh
            //se elementi jone krahasues
            while (position > 0 && array[position - 1] > current) {
                // ne pozite ku kam qene, vendose elementin paraprak
                array[position] = array[position - 1];
                //shko tash ne pozite tjeter per krahasim
                position--;
            }
            //ne qat pozite qe je mbet vendose current
            array[position] = current;
        }
    }
}













