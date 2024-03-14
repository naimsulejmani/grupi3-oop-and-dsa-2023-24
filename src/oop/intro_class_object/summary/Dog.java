package oop.intro_class_object.summary;

public class Dog {

    //variablat instance
    private String name;
    private int weight;
    private String toy;

    //constructors
    public Dog() {
    }

    public Dog(String name, int weight, String toy) {
        this.name = name;
        this.weight = weight;
        this.toy = toy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getToy() {
        return toy;
    }

    public void setToy(String toy) {
        this.toy = toy;
    }

    public int compareTo(Dog anotherDog) {
        return this.weight - anotherDog.weight;
    }
}









