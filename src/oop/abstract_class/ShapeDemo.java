package oop.abstract_class;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Square();
//        Shape shape3 = new Shape(); // e palogjikshme

        shape1.draw();
        shape2.draw();


    }
}
