package oop.polymorphism.ushtrime;

public final class RightTriangle extends Triangle {
    public RightTriangle() {
    }

    public RightTriangle(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public double area() {
        return (super.getA() * super.getB()) / 2;
    }

//    public double perimeter() {
//        return getC() + getB() + getA() + 100;
//    }
}
