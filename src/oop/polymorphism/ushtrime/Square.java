package oop.polymorphism.ushtrime;

public final class Square extends Shape{
    private double side;

    public Square() {
    }

    public Square(final double side) {
//        side++;
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(final double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    public double perimeter() {
        return 4 * side;
    }


}
















