package oop.inheritance.payroll;

import java.time.LocalDateTime;

public class Paycheck {
    private Employee employee;
    private int month;
    private int year;
    private LocalDateTime createdAt = LocalDateTime.now();

    public Paycheck(Employee employee, int month, int year) {
        this.employee = employee;
        this.month = month;
        this.year = year;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        sb.append("============================================\n");
        sb.append(String.format("Paga per periudhen %d/%d%n", month, year));
        sb.append("============================================\n");
        sb.append(employee);
        sb.append("\n---------------------------------------------\n");
        sb.append(String.format("Paga totale: %.2f EUR%n", employee.pay()));
        sb.append("============================================\n");
        sb.append("Leshuar me: " + getCreatedAt());
        sb.append("\n============================================\n");
        return sb.toString();
    }

    public void print() {
        System.out.println(this);
        //System.out.println(toString());
    }
}











