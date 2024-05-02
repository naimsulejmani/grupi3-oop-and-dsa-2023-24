package oop.inheritance.payroll;

import java.time.LocalDate;

public class ContractEmployee extends Employee {
    private int hours;
    private double hourlyRate;

    public ContractEmployee() {
    }

    public ContractEmployee(int id, String name, String lastname, LocalDate birthdate, int hours, double hourlyRate) {
        super(id, name, lastname, birthdate);
        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double pay() {
        return hours * hourlyRate;
    }

    @Override
    public String toString() {
        return String.format("""
                %s
                hours: %d
                hourlyRate: %.2f
                """, super.toString(), hours, hourlyRate);
    }
}













