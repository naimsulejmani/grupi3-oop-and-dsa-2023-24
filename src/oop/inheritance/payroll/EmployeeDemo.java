package oop.inheritance.payroll;

import java.time.LocalDate;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee employee1 =
                new Manager(1, "Adnan", "Smajli",
                        LocalDate.of(2003, 7, 7),
                        600, 0.03f
                );

        Employee employee2 = new Programmer(2, "Eriona", "Kadriu",
                LocalDate.of(2005, 4, 13), 1000, "fullstack");

        Employee employee3 = new Consultant(3, "Brikend", "Gjyliqi",
                LocalDate.of(2004, 1, 1), 30, 25, 350);



        System.out.println(employee3.pay());
        System.out.println(employee2.pay());
        System.out.println(employee3);

    }
}
