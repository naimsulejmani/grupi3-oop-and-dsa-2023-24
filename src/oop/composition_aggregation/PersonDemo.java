package oop.composition_aggregation;

public class PersonDemo {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person(new Brain());
        Person p3 = new Person(null);
    }
}
