package oop.intro_class_object.detyra;

public class Point {
    private double x;
    private double y;

    public Point() {

    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void print() {
        System.out.printf("(%.2f, %.2f)%n", x, y);
    }


    public double distanceTo(Point otherPoint) {
        return Math.sqrt(
                Math.pow(otherPoint.x - this.x, 2) +
                        Math.pow(otherPoint.y - this.y, 2)
        );
    }

    public static double distanceBetween(Point from, Point to) {
        return from.distanceTo(to);
//        return Math.sqrt(
//                Math.pow(from.x - to.x, 2) +
//                        Math.pow(from.y - to.y, 2)
//        );
    }


}











