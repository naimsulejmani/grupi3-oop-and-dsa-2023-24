package oop.inheritance.payroll;

import java.time.LocalDate;

public class EmployeeDemo {
    public static void main(String[] args) {

        Employee employee3 = new Consultant(3, "Brikend", "Gjyliqi",
                LocalDate.of(2004, 1, 1), 30, 25, 350);


        Paycheck paycheck = new Paycheck(employee3, 4, 2024);
        System.out.println(paycheck);
    }
}


















