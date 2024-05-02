package oop.inheritance.payroll;

import java.time.LocalDate;

public class Secretary extends ContractEmployee{
    private String department;

    public Secretary() {
    }

    public Secretary(int id, String name, String lastname, LocalDate birthdate, int hours, double hourlyRate, String department) {
        super(id, name, lastname, birthdate, hours, hourlyRate);

        this.department = department;

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return String.format("""
                %s
                department:%s
                position:Secretary
                """,super.toString(),department);
    }
}














