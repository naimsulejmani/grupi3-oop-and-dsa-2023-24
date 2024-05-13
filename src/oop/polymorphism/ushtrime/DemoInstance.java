package oop.polymorphism.ushtrime;

public class DemoInstance {
    public static void main(String[] args) {
        //Upcasting -> java e konverton circle ne shape ne menyre automatike
        Shape shape1 = new Circle(5.5);
        Circle c1 = new Circle(4.5);

        DemoInstance demoInstance = new DemoInstance();
        demoInstance.checkShape(shape1);
//        demoInstance.checkShape(c1);
    }

    private void checkShape(Shape shape) {
        if (shape instanceof Circle) {
            System.out.println("I am  a Circle");
            //DownCasting
            Circle circle = (Circle) shape;
            System.out.println("Radius: " + circle.getRadius());
        }
        if (shape instanceof Square) {
            System.out.println("I am a Square");
            Square square = (Square) shape;
            System.out.println("Side: " + square.getSide());
        }
        if (shape instanceof Shape) {
            System.out.println("I am a shape!");
        }
        if (shape instanceof Object) {
            System.out.println("I am an object!");
        }
        System.out.println("Area: " + shape.area());
        System.out.println("Perimeter: " + shape.perimeter());
    }
}
