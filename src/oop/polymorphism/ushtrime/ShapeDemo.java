package oop.polymorphism.ushtrime;

public class ShapeDemo {
    public static void main(String[] args) {
        //upcasting
        Shape sh1 = new Circle(4);
        Shape sh2 = new Square(5);
        Shape sh3 = new RightTriangle(3, 4, 5);

        //ska logjike me u kriju
        Shape sh4 = new Shape();

        Circle c1 = new Circle(5);

        System.out.println(c1.getRadius());

        System.out.println(sh1.area());
        System.out.println(sh1.perimeter());

        System.out.println(sh2.area());
        System.out.println(sh2.perimeter());
    }
}
