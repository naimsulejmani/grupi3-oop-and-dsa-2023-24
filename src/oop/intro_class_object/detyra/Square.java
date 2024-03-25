package oop.intro_class_object.detyra;

public class Square {
    private double a = 1;

    public Square(double a) {
        setA(a);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a <= 0) {
            System.out.println("Vlera duhet te jete pozitive! ");
            return;
        }
        this.a = a;

    }

    public double area() {
        return Math.pow(a, 2);
    }

    public double perimeter() {
        return 4 * a;
    }

    public void draw() {
        System.out.println("---------");
        System.out.println("|        |");
        System.out.println("|        |");
        System.out.println("---------");
    }

    public boolean hasGreaterAreaThan(Square nextSquare){
        return this.a > nextSquare.a;
    }
}








