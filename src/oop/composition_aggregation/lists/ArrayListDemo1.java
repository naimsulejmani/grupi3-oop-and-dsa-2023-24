package oop.composition_aggregation.lists;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<int[]> listMeArrayInt = new ArrayList<>();
        listMeArrayInt.add(new int[]{1, 2, 34});

        ArrayList<String> names = new ArrayList<>();
        names.add("Naim");
        names.add("Sulejmani");
        names.addFirst("Naim");
        names.addLast("Ylli");
        names.add(2, "TEST");
        String emriPare = names.getFirst();
        String emriDyte = names.get(1);


        boolean existNaim = names.contains("Naim");
        names.set(0, "Filan"); // update elementit te arraylists

        names.remove(1);
        names.remove("Naim");


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);

        int numriPare = numbers.getFirst();
        int numriDyte = numbers.get(1);
        names.remove(Integer.valueOf(5));
        names.removeFirst();

        names.clear();


    }
}
