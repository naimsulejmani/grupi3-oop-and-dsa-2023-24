package oop.inheritance.payroll;

import java.time.LocalDate;

public class Programmer extends RegularEmployee{
    private String type;

    public Programmer() {
    }

    public Programmer(int id, String name, String lastname, LocalDate birthdate, double salary, String type) {
        super(id, name, lastname, birthdate, salary);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("""
                %s
                Type: %s
                Position: Programmer
                """,super.toString(),type);
    }
}
