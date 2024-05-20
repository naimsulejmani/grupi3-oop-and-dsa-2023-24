package oop.exceptions;

import java.io.*;

public class Example3 {
    public static void main(String[] args) {
        //gjithcka qe deklarohet brenda try() duhet me qene auto-closeable
        //vetmbylles, edhe ski nevoje ti me mbyll ne fund e mbyll java per ty
        try (
                BufferedReader in = new BufferedReader(new FileReader("files/test.txt"));
                PrintWriter out = new PrintWriter(new FileWriter("files/copy_test.txt"))
        ) {
            String line = in.readLine();
            out.println(line);
            out.printf("%d - %s%n", 100, line);
        } catch (FileNotFoundException ex) {
            System.out.println("File not found! " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("I/O error! " + ex.getMessage());
            Throwable[] suppressed = ex.getSuppressed();
            for (Throwable throwable : suppressed) {
                System.out.println(throwable.getMessage());
            }

            System.out.println(ex.getCause().getMessage());
        }
    }
}
