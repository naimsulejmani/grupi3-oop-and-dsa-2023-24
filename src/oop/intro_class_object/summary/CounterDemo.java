package oop.intro_class_object.summary;

public class CounterDemo {
    public static void main(String[] args) {
        Counter votatKFE = new Counter();
        Counter votatPushtet = new Counter(5000);
        Counter ditetERamazanit = new Counter();
        Counter realGoals = new Counter();
        Counter barcaGoals = new Counter();
        ditetERamazanit.increment();
        ditetERamazanit.increment();
        ditetERamazanit.increment();
        ditetERamazanit.increment();
        System.out.println(ditetERamazanit.getValue());
    }
}










