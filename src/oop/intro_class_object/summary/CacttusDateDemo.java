package oop.intro_class_object.summary;

public class CacttusDateDemo {
    public static void main(String[] args) {
        CacttusDate data1 = new CacttusDate();
        CacttusDate data2 = new CacttusDate(-2024, 133, 22);
        data2.setDay(31);
        data2.setDay(-10);

        CacttusDate data3 = CacttusDate.valueOf("21.3.2024");

        data1.print();
        data2.print();

        System.out.println(data3.getDay());
        System.out.println(data3.getMonth());
        System.out.println(data3.getYear());
        data3.print();
    }
}
