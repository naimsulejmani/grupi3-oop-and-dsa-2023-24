package oop.composition_aggregation.lists;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();//default capacity = 0
        ArrayList list2 = new ArrayList(250);

        list1.add(1); // int -> Integer
        list2.add(23.23); // double -> Double
        list2.add("TEST"); //
        list2.add(true); // boolean -> Boolean

        System.out.println(list2.size());

        Object obj1 = list2.getFirst();
        Object objLast = list2.getLast();
        Object obj2 = list2.get(1);


        boolean intLast = (boolean) objLast;
        System.out.println(intLast);

        Object[] vargu = {1, "2", 3.0, 4L};
      //  vargu[0]++; //sm,undemi se e eshte object me :)
    }
}
