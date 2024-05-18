package oop.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFiles {
    public static void main(String[] args) {
        String fileName = "src/oop/exceptions/ReadFiles.java"; //emriifajllit.prapashtesa
        int lines = countLines(fileName);
        System.out.println("Total number of lines: " + lines);
    }

    private static int countLines(String fileName) {
        int counter = 0;
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

        String line = null;
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
            counter++;
        }
        return counter;
    }
}
