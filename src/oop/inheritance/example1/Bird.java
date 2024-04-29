package oop.inheritance.example1;

public class Bird {
    private String call;
    private String color;
    private String food;
    private String movement;
    private String sound;

    public Bird() {
        super();
    }

    public Bird(String call, String color, String food, String movement, String sound) {
        super();
        this.call = call;
        this.color = color;
        this.food = food;
        this.movement = movement;
        this.sound = sound;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "call='" + call + '\'' +
                ", color='" + color + '\'' +
                ", food='" + food + '\'' +
                ", movement='" + movement + '\'' +
                ", sound='" + sound + '\'' +
                '}';
    }
}
