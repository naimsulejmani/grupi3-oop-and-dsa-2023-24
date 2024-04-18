package oop.composition_aggregation.shembull1;

public class Student {
    private static int identity = 0;
    private final int ID;
    private String name;
    private String surname;

    public Student(String name, String surname) {
        this.ID = ++identity;
        this.name = name;
        this.surname = surname;
    }

    public int getID() {
        return ID;
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


    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
