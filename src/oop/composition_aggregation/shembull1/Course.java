package oop.composition_aggregation.shembull1;

import java.util.ArrayList;
import java.util.Arrays;

public class Course {
    private final String ID;
    private String name;
    private String description;
    private String trainer;
    private final int MAX_STUDENTS;
    //    private Student[] students;
//    private int numberOfStudents = 0;
    private ArrayList<Student> students;

    public Course(String ID, String name, String description, String trainer, int MAX_STUDENTS) {
        this.ID = ID;
        this.MAX_STUDENTS = MAX_STUDENTS;
        this.name = name;
        this.description = description;
        this.trainer = trainer;
//        this.students = new Student[MAX_STUDENTS];
        this.students = new ArrayList<>();
    }

    public Course(String ID, String name, String description, String trainer) {
        this(ID, name, description, trainer, 100);
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public void enrollStudent(Student student) {
        if (students.size() < MAX_STUDENTS) {
//            students[numberOfStudents++] = student;
            if (students.contains(student)) {
                System.out.println("Already registered! -> " + student);
            } else {
                students.add(student);
            }
        } else {
            System.out.println("Course is full! No seat available!");
        }
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    @Override
    public String toString() {
//        String response = "";
//        response+="----------------------------------";
//        response+="\nID: " + ID + "\nName: " + name + "\nDescription: " + description + "\nTrainer: " + trainer;
//        response+="\nNumber of students: " + numberOfStudents;
//        response+="-----------------------------------";
//        return response;

        StringBuilder sb = new StringBuilder("");
        sb.append(String.format("Course: %s - %s%n", ID, name));
        sb.append(String.format("Description: %s%n", description));
        sb.append(String.format("Trainer: %s%n", trainer));
        sb.append(String.format("Registered Students: %d%n", students.size()));
        sb.append(String.format("Free seats: %d%n", MAX_STUDENTS - students.size()));
        sb.append("List\n").append("-----------------------------------\n");
        for (Student student : students) {
//            if (student == null) break;
            sb.append(String.format("%d - %s %s %n",
                    student.getID(), student.getName(), student.getSurname()));
        }
        sb.append("-----------------------------------\n");
        return sb.toString();
    }
}







