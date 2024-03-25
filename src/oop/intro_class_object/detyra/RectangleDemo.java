package oop.intro_class_object.detyra;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(5,5);
        Rectangle r3 = new Rectangle(-3, 5);

        System.out.println(r1.area());
        System.out.println(r2.isSquare());
        System.out.println(r3.perimeter());

    }
}
