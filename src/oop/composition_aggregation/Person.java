package oop.composition_aggregation;

public class Person {
    private Brain brain;


    public Person() {
    }

    public Person(Brain brain) {
        this.brain = brain;
    }

    public Brain getBrain() {
        return brain;
    }

    public void setBrain(Brain brain) {
        this.brain = brain;
    }
}
