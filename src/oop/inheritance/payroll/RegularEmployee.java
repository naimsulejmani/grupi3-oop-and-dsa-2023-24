package oop.inheritance.payroll;

import java.time.LocalDate;

public class RegularEmployee extends Employee{
    private double salary;

    public RegularEmployee() {
    }

    public RegularEmployee(int id, String name, String lastname, LocalDate birthdate, double salary) {
        super(id, name, lastname, birthdate);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double pay() {
      return salary;
    }

    @Override
    public String toString() {
        return String.format("""
               %s 
               salary: %.2f
                """,super.toString(),salary);
    }
}
















