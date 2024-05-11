package oop.polymorphism.finalization;

public class GameDemo {
    public static void main(String[] args) {
//        Game g1 = new Game(1, "Minecraft");
//        System.out.println(g1);

        Game g2 = new WarGame(2, "Warzone", 11231L);
        System.out.println(g2.getId());
    }
}
