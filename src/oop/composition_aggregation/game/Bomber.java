package oop.composition_aggregation.game;

public class Bomber {
    private int x;
    private int y;
    private int damage;
    private AntiAirCraft target;

    public Bomber(int x, int y, int damage) {
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

    public AntiAirCraft getTarget() {
        return target;
    }

    public void setTarget(AntiAirCraft target) {
        this.target = target;
    }
}
