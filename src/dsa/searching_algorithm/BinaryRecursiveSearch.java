package dsa.searching_algorithm;

public class BinaryRecursiveSearch {
    public static int searchIndexRecursively(int[] array, int searchElement, int low, int high) {
        if (low > high) return -1;

        int mid = (low + high) / 2;

        if (searchElement == array[mid])
            return mid;
        else if (searchElement < array[mid])
            return searchIndexRecursively(array, searchElement, low, mid - 1);
        else
            return searchIndexRecursively(array, searchElement, mid + 1, high);
    }

    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99, 1010};
        int index = searchIndexRecursively(array, 88, 0, array.length - 1);
        System.out.println(index);
    }
}








