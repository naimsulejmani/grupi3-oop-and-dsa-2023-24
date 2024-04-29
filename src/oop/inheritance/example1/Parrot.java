package oop.inheritance.example1;

public class Parrot extends FlyingBird {
    public Parrot() {
    }

    public Parrot(String call, String color, String food, String movement, String sound, float maxFlewHeight) {
        super(call, color, food, movement, sound, maxFlewHeight);
    }

    @Override
    public String toString() {
        return String.format("Parrot{parent=%s}", super.toString());
    }
}
