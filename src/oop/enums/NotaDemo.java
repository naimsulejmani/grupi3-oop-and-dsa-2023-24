package oop.enums;

public class NotaDemo {
    public static void main(String[] args) {
        Nota.SHKELQYESHEM.print();

        Nota[] notat = Nota.values();

        for (Nota note : notat) {
            System.out.print("Nota " + note + " -> ");
            note.print();

            if (note.getValue() == 4) {
                System.out.println("YUMMII ja qellova notes 4" + note);
            }
        }

        System.out.println(Nota.SHKELQYESHEM.compareTo(Nota.DOBET));
        System.out.println(Nota.DOBET.compareTo(Nota.SHKELQYESHEM));

    }
}









