package oop.inheritance.payroll;

import java.time.LocalDate;
import java.util.ArrayList;

public class PayrollGenerator {
    public static void main(String[] args) {
        String employeeCSV = """
                1,Adnan,Smajli,2005-05-25,Programmer,500,full-stack
                2,Eriona,Kadriu,2006-06-26,Manager,1000,0.05
                3,Endri,Begaj,2004-04-24,Secretary,100,15,IT
                4,Kreshnik,Hoti,2000-01-01,Consultant,50,200,2000
                """;
        String[] employeeStrings = employeeCSV.split("\n");
        ArrayList<Employee> employees = new ArrayList<>();
        for (String employeeString : employeeStrings) {
            String[] employeeAttributes = employeeString.split(",");
            int id = Integer.parseInt(employeeAttributes[0]);
            String name = employeeAttributes[1];
            String lastName = employeeAttributes[2];
            LocalDate birthdate = LocalDate.parse(employeeAttributes[3]);
            String position = employeeAttributes[4];

            Employee employee = null;

            switch (position) {
                case "Programmer" -> {
                    double salary = Double.parseDouble(employeeAttributes[5]);
                    String type = employeeAttributes[6];
                    employee = new Programmer(id, name, lastName, birthdate, salary, type);
                }
                case "Manager" -> {
                    double salary = Double.parseDouble(employeeAttributes[5]);
                    float bonusPercentage = Float.parseFloat(employeeAttributes[6]);
                    employee = new Manager(id, name, lastName, birthdate, salary, bonusPercentage);
                }
                case "Secretary" -> {
                    int hours = Integer.parseInt(employeeAttributes[5]);
                    double hourlyRate = Double.parseDouble(employeeAttributes[6]);
                    String departament = employeeAttributes[7];
                    employee =
                            new Secretary(id, name, lastName, birthdate, hours, hourlyRate, departament);
                }
                case "Consultant" -> {
                    int hours = Integer.parseInt(employeeAttributes[5]);
                    double hourlyRate = Double.parseDouble(employeeAttributes[6]);
                    double extraPay = Double.parseDouble(employeeAttributes[7]);
                    employee = new Consultant(id, name, lastName, birthdate, hours, hourlyRate, extraPay);
                }
                default -> {
                    System.out.println("Nuk eshte menaxhuar per pozite te tille: " + position);
                    continue;
                }
            }
            employees.add(employee);

        }

        //lista me puntore, muaji, viti
        proceedWithPaycheck(employees, 4, 2024);


    }

    private static void proceedWithPaycheck(ArrayList<Employee> employees, int month, int year) {
        for (Employee employee : employees) {
            //anonymous object
            new Paycheck(employee, month, year).print();
        }
    }
}








