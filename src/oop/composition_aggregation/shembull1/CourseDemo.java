package oop.composition_aggregation.shembull1;

public class CourseDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Adnan", "Adnani");
        Student s2 = new Student("Kreshnik", "Kreshniku");
        Student s3 = new Student("Shahiste", "Shahistja");
        Student s4 = new Student("Arvanit", "Arvaniti");
        Student s5 = new Student("Sarah", "Sarah");

        Course c1 = new Course("OOP",
                "Programimi i orientuar ne Objekte"
                , "Msohet gjithcka, lende palidhje behet me lidhje kur bjen prej provimit",
                "Naim Sulejmani",
                3);

        Course c2 = new Course("MTM", "Matematika Kompjuterike",
                "Gjithcka qe msoni, msohet mire",
                "Gezim Cirriku");

        c1.enrollStudent(s1);
        c1.enrollStudent(s2);
        c1.enrollStudent(s3);
        c1.enrollStudent(s4);
        System.out.println(c1);

        System.out.println("--------------------");
        c2.enrollStudent(s1);
        c2.enrollStudent(s2);
        c2.enrollStudent(s3);
        c2.enrollStudent(s4);
        c2.enrollStudent(s5);
        System.out.println(c2);
    }
}












