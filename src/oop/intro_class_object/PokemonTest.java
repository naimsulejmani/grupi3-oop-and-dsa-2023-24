package oop.intro_class_object;

public class PokemonTest {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon();
        pikachu.name = "Pikachu";
        pikachu.health = 100;
        pikachu.type = "Electric";

        Pokemon adnaninjo = new Pokemon();
        adnaninjo.name = "Adnan";
        adnaninjo.type = "me fjale";
        adnaninjo.health = 25;


        pikachu.attack(adnaninjo);
        pikachu.attack(adnaninjo);
        pikachu.attack(adnaninjo);
        pikachu.attack(adnaninjo);
        pikachu.attack(adnaninjo);


        pikachu.name = "Profinjo";

        System.out.println("Shneta e adnanit -> " + adnaninjo.health);

    }
}
