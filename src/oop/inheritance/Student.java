package oop.inheritance;

public class Student extends Person {
    private String department;

    public Student() {
    }

    public Student(String name, String surname, int age, String department) {
        super(name, surname, age);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return super.getAge() - 10;
    }
}
