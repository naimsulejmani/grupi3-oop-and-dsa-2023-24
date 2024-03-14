

package oop.intro_class_object.summary;

public class DogDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Luki", 33, "ball");
        Dog dog2 = new Dog("Lesi", 22, "tennis");

        System.out.println(dog1.compareTo(dog2));
        System.out.println(dog2.compareTo(dog1));
        System.out.println(dog2.compareTo(dog2));
    }
}
