package oop.inheritance.example1;

public class Owl extends FlyingBird {
    public Owl() {
    }

    public Owl(String call, String color, String food, String movement, String sound, float maxFlewHeight) {
        super(call, color, food, movement, sound, maxFlewHeight);
    }

    @Override
    public String toString() {
        return String.format("Owl{parent=%s}", super.toString());
    }
}
