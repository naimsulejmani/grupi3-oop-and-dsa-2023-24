package oop.composition_aggregation;

import java.time.LocalDate;

public class Student {
    private String name;
    private String surname;
    private LocalDate birthdate;

    public Student(String name, String surname, LocalDate birthdate) {
        this.name = name;
        this.surname = surname;
        if (birthdate != null)
            this.birthdate = birthdate;
        else
            this.birthdate = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
}
