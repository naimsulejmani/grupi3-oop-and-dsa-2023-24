package dsa;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList names = new ArrayList();
        names.add("Adnani me syza *Kresha*");
        names.add("Shahistja");
        names.add("Ylli");
        names.add(0, "Edin");
        names.add(0, "Filani");
        names.add(10);
        names.add(true);
        names.add('A');
        names.add(20F);
        names.add(35.50);

        names.set(0, "Filanja");
        names.remove(9);

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        System.out.println("----------------");
        for (Object name : names) {
            System.out.println(name);
        }
        System.out.println("-------------------------");
        System.out.println(names);


    }
}
