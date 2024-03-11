package oop.intro_class_object.ushtrime;

public class StudentTest {
    public static void main(String[] args) {

        //EmriKlases emriVariables = new EmriKlases();
        Student stud1 = new Student();
        stud1.setId(100);
        stud1.setName("Kreshnik");
        System.out.println(stud1.getId());
        System.out.println(stud1.getName());
        stud1.setId(-100);
        System.out.println(stud1.getId());
        stud1.setName("           ");
        System.out.println(stud1.getName());
    }
}
