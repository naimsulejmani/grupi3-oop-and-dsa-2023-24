package oop.intro_class_object.detyra;

public class Rectangle {
    private double a = 1;
    private double b = 2;

    public Rectangle(double a, double b) {
        setA(a);
        setB(b);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a <= 0) {
            System.out.println("Duhet vlera positive");
            return;
        }
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        if (b <= 0) {
            System.out.println("Duhet vlera positive");
            return;
        }
        this.b = b;
    }

    public double area() {
        return a * b;
    }

    public double perimeter() {
        return 2 * (a + b);
    }

    public boolean isSquare(){
        return a == b;
    }

}
