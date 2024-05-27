package oop.generics;

import java.util.ArrayList;

public class BeforeJava5 {
    public static void main(String[] args) {
        Object o1 = 10;
        Object o2 = 23.4F;
        Object o3 = "Naim";
        Object o4 = new ArrayList<String>();
        Object o5 = new int[]{1, 2, 3};
        castObject(o3);
    }

    private static void castObject(Object o) {
        int i = (int)o;
        System.out.println(i);
    }
}
