package dsa.searching_algorithm;

public class BinarySearch {
    public static int searchIndex(int[] array, int searchValue) {
        int low = 0; // indeksi i elementit te pare ne varg
        int high = array.length - 1; // indeksi i elementit te fundit ne varg
        while (low <= high) {
            int mid = (low + high) / 2;
            if (searchValue == array[mid])
                return mid;
            else if (searchValue > array[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static boolean exists(int[] array, int searchValue) {
        return searchIndex(array, searchValue) >= 0;
    }





    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99, 1010};
        int index1 = searchIndex(array, 77);
        System.out.println(index1);
    }
}
















