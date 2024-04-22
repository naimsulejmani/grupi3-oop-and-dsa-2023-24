package oop.composition_aggregation.game;

public class AntiAirCraft {
    private int x;
    private int y;
    private int damage;
    private Bomber target;

    public AntiAirCraft(int x, int y, int damage) {
        this.x = x;
        this.y = y;
        this.damage = damage;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Bomber getTarget() {
        return target;
    }

    public void setTarget(Bomber target) {
        this.target = target;
    }
}
