package oop.inheritance.example1;

public class FlyingBird extends Bird {
    private float maxFlewHeight;

    public FlyingBird() {
    }

    public FlyingBird(String call, String color, String food, String movement, String sound, float maxFlewHeight) {
        super(call, color, food, movement, sound);
        this.maxFlewHeight = maxFlewHeight;
    }

    public float getMaxFlewHeight() {
        return maxFlewHeight;
    }

    public void setMaxFlewHeight(float maxFlewHeight) {
        this.maxFlewHeight = maxFlewHeight;
    }

    @Override
    public String toString() {
        return "FlyingBird{" +
                "maxFlewHeight=" + maxFlewHeight +
                "parent=" + super.toString() +
                '}';
    }
}













