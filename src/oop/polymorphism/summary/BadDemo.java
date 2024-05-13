package oop.polymorphism.summary;

public class BadDemo {
    public static void main(String[] args) {
        Person person = new Person("Arvanit", "Realisti");
        Student student = new Student(person, "ZHWM");


        System.out.println(student.getPerson().getName());
        //Student p = new Student("A","B","ZHWM");
    }
}
