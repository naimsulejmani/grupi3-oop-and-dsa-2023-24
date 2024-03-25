package oop.intro_class_object.detyra;

public class PointDemo {
    public static void main(String[] args) {
        Point pika1 = new Point();

        pika1.print();

        Point pika2 = new Point(3, 4);
        pika2.print();

        double diff12 = pika1.distanceTo(pika2);
        System.out.println("Distanca e pikes 1 me 2 eshte: " + diff12);
        System.out.println(pika2.distanceTo(pika1));


        double diffTjeter = Point.distanceBetween(pika1, pika2);
        double diffTjeter1 = Point.distanceBetween(pika2, new Point(1, 2));

    }
}








