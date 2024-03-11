package oop.intro_class_object.ushtrime;

import java.time.LocalDate;

//modifikatori  class EmriKlases {
// trupi
// }
public class Student {
    // 1. variablat instance
    private int id;
    private String name;
    private String surname;
    private LocalDate birthdate;
    private char gender;
    private String city;
    private String country;
    private String address;
    private String postalCode;
    private String email;
    private LocalDate registerDate;
    private String department;
    private boolean active;


    // 2. constructors
    public Student() {
        //default constructor
    }


    // 3. getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) {
            System.out.println("Nuk guxon ID te jete me vogel se 1!");
            return;
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            System.out.println("Nuk guxon emri te jete NULL");
            return;
        } else if (name.isBlank()) { // "", "             "
            System.out.println("Nuk guxon emri te jete tekst i zbrazet ose vetem space!");
            return;
        } else if (name.trim().length() < 2) {
            System.out.println("Nuk guxon teksti te jete me pas se dy karaktere!");
            return;
        }
        this.name = name;
    }
}








