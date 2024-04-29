package oop.inheritance.example1;

public class WalkingBird extends Bird {

    public WalkingBird() {
        super();
    }

    public WalkingBird(String call, String color, String food, String movement, String sound) {
        super(call, color, food, movement, sound);
    }

    @Override
    public String toString() {
        return "WalkingBird{" +
                "parent=" + super.toString() +
                "}";
        //return String.format("WalkingBird{parent=%s}", super.toString());
    }
}
