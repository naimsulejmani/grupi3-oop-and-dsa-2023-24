package oop.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example2 {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("files/test.txt"));
            String text = reader.readLine();
            System.out.println(text);
        } catch (FileNotFoundException e) {
            System.out.println("File not found! " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O Error! " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Spo muj me mshel file!" + e.getMessage());
                }
            }
        }
    }
}
