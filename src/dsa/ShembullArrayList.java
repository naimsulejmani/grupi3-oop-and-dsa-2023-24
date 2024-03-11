
package dsa;

import java.util.ArrayList;
import java.util.Scanner;

public class ShembullArrayList {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Sa nota: ");
        int nrNotat = reader.nextInt();

        ArrayList notat = new ArrayList();//10

        for (int i = 1; i <= nrNotat; i++) {
            System.out.printf("Shkruaj noten e %d: ", i);
            int nota = reader.nextInt();
            notat.add(nota);
        }


        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (Object objNota : notat) {
            int nota = (int) objNota;
            sum += nota;

            if (nota < min)
                min = nota;

            if (nota > max)
                max = nota;

        }

        double avg = (double) sum / notat.size();
        System.out.println(notat);
        System.out.println("Nota maximale: " + max);
        System.out.println("Nota minimale: " + min);
        System.out.println("Nota mesatare: " + avg);

        


    }
}














