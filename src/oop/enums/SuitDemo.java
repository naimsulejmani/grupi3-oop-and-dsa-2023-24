package oop.enums;

public class SuitDemo {
    public static void main(String[] args) {

        drawSuitOnCard(100_000);
        drawSuitOnCard(-1_000);

        drawSuitOnCard(Suit.CLUBS);
        drawSuitOnCard(Suit.DIAMOND);
        drawSuitOnCard(Suit.HEARTS);
        drawSuitOnCard(Suit.SPADES);


        SuitOld old1 = SuitOld.CLUBS;


    }

    //bad way
    public static void drawSuitOnCard(int suit) {

    }

    //good way
    public static void drawSuitOnCard(Suit suit) {

    }
}
