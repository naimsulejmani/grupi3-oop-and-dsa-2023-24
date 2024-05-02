package oop.inheritance.payroll;

import java.time.LocalDate;

public class Employee {
    private int id;
    private String name;
    private String lastname;
    private LocalDate birthdate;

    public Employee() {
    }

    public Employee(int id, String name, String lastname, LocalDate birthdate) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.birthdate = birthdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
    public double pay(){
        return 0.0;
    }

    @Override
    public String toString() {
        return String.format("""
                id:%d
                name:%s
                lastname:%s
                birthdate:%s
                """,id,name,lastname,birthdate);
    }
}
















