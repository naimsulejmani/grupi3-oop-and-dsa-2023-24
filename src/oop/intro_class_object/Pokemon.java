package oop.intro_class_object;

public class Pokemon {
    String name;
    String type;
    int health;

    public boolean dodge() {
        return Math.random() > 0.5;
    }

    void attack(Pokemon enemy) {
        System.out.println("Sulmi");
        if (!enemy.dodge()) {
            enemy.health--;
        }
    }

}









