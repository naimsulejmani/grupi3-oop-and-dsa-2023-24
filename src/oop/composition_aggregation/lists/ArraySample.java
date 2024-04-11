package oop.composition_aggregation.lists;

import java.util.Arrays;

public class ArraySample {
    private String[] array;

    public ArraySample() {
        array = new String[3];
        array[0] = "Ylli";
        array[1] = "Eriona";
        array[2] = "Engjulli";

        System.out.println(Arrays.toString(array));
    }

    public void main(String[] args) {
        ArraySample a = new ArraySample();

        int[] numrat = {1, 2, 3};
        int x[];
        //x = {1,2,3}; // kjo nuk ben
        x = new int[]{1, 2, 3};

    }
}











