package oop.intro_class_object.summary;

public class Counter {
    private static final int MAX_VALUE = 3;
    private int value;

    public Counter() {
        //default constructor
    }

    public Counter(int value) {
        if (value >= 0 && value <= MAX_VALUE)
            this.value = value;
        else
            System.out.println("Out of range! Will instantiate with 0!");
    }

    public int getValue() {
        return value;
    }

    public void increment() {
        if (this.value < MAX_VALUE)
            this.value++;
        else
            this.value = 0;
    }

}



















