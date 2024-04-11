package oop.parameter_passing;

import oop.intro_class_object.summary.CacttusDate;

public class PassTestingDemo {
    public static void main(String[] args) {
        int value = 10;

        System.out.println("main value start " + value);
        changePrimitive(value);
        System.out.println("main value end " + value);

        CacttusDate dt1 = new CacttusDate(2023, 1, 1);
        dt1.print();
        changeReference1(dt1);
        dt1.print();

        CacttusDate dt2 = new CacttusDate(2024, 1, 1);

        changeReference2(dt1, dt2);

        dt2.print();

    }

    public static void changePrimitive(int value) {
        System.out.println("changePrimitive start " + value);
        value++;
        System.out.println("changePrimitive end " + value);
    }

    public static void changeReference(CacttusDate date) {
        date.setDay(8);
        date.setMonth(4);
        date.setYear(2024);
    }

    public static void changeReference1(CacttusDate date) {
        date = new CacttusDate(2020, 1, 1);
        date.print();
    }

    public static void changeReference2(CacttusDate from, CacttusDate to) {
        CacttusDate temp = from;
        from = to;
        to = temp;
    }

}
