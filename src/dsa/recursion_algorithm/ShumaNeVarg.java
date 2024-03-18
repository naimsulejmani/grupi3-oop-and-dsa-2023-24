package dsa.recursion_algorithm;

public class ShumaNeVarg {
    public static void main(String[] args) {
        int[] array = {10, 22, 33, 90};
        System.out.println(sum(array, array.length - 1));
    }

    // {10, 22, 33, 90}
    static int sum(int[] array, int index) {
        if (index == 0)
            return array[index];
        else
            return array[index] + sum(array, index - 1);
    }
}
