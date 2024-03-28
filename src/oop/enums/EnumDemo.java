package oop.enums;

public class EnumDemo {
    public static void main(String[] args) {
        Season s1 = Season.SUMMER;
        Season s2 = Season.WINTER;


        System.out.println(s1.toString());
        System.out.println(s2);


        Season s3 = Season.valueOf("SUMMER");
        System.out.println(s3.toString());
        s3 = Season.valueOf("TEST");
    }
}









