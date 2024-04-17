package oop.composition_aggregation.csv;

import java.util.ArrayList;

public class PersonDemo {
    public static void main(String[] args) {

        String csvText = readFile("studentat.csv");
        ArrayList<Person> persons = new ArrayList<>();
        String[] rows = csvText.split("\n");

        System.out.println(rows.length);
        for (String row : rows) {
            String[] columns = row.split(",");
            String firstName = columns[0].split(" ")[0];
            String lastName = columns[0].split(" ")[1];
            int year = Integer.parseInt(columns[1]);
            int month = Integer.parseInt(columns[2]);
            int day = Integer.parseInt(columns[3]);
            Date birthDate = new Date(year, month, day);
            Person person = new Person(firstName, lastName, birthDate);
            persons.add(person);
        }


        writeFile("new_student.csv", persons);


    }

    private static void writeFile(String fileName, ArrayList<Person> persons) {
        System.out.println("Filename: " + fileName);
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    private static String readFile(String s) {
        return """
                Adnan Smajli,2005,11,11
                Eriona Kadriu,2006,1,1
                Edin Kokedhembja,2004,4,4
                """;
    }
}
