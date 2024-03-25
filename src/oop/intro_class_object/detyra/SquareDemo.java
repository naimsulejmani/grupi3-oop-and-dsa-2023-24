package oop.intro_class_object.detyra;

public class SquareDemo {
    public static void main(String[] args) {
        Square s1 = new Square(10);
        Square s2 = new Square(-20);

        System.out.println(s2.getA());
        System.out.println(s1.getA());

        System.out.println(s1.perimeter());
        System.out.println(s1.area());
        s1.draw();

        System.out.println(s1.hasGreaterAreaThan(s2));
        System.out.println(s2.hasGreaterAreaThan(s1));
    }
}
