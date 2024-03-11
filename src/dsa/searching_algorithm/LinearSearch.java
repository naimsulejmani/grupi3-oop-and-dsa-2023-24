package dsa.searching_algorithm;

public class LinearSearch {
    public static int searchIndex(int[] array, int searchValue) {

        for (int index = 0; index < array.length; index++) {
            if (searchValue == array[index])
                return index;
        }
        return -1;
    }

    public static boolean exists(int[] array, int searchValue) {
//        for (int number : array) {
//            if (number == searchValue)
//                return true;
//        }
//        return false;
        return searchIndex(array, searchValue) >= 0;
    }

    public static void main(String[] args) {
        int[] array = {77, 11, 22, 66, 55, 44, 99, 33, 100, 88};
        int index1 = searchIndex(array, 33);
        boolean exists1 = exists(array, 33);
        int index2 = searchIndex(array, 10);
        boolean exists2 = exists(array, 10);

        System.out.println(index1);
        System.out.println(exists1);
        System.out.println(index2);
        System.out.println(exists2);
    }
}
















