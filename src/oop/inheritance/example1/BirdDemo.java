package oop.inheritance.example1;

public class BirdDemo {
    public static void main(String[] args) {
        Bird b1 = new Bird();
        FlyingBird f1 = new FlyingBird();
        Parrot p1 = new Parrot();
        TalkingParrot tp1 = new TalkingParrot();

        TalkingParrot tp2 = new TalkingParrot(
                "parcelonist", "pink", "humbje",
                "shetiten me top", "real madrid kuku",
                -11,
                new String[]{"referat", "me hile", "humbje", "Real Madrid"}
        );

        Bird b2 = new TalkingParrot();  
        Bird b3 = new FlyingBird();


        System.out.println("b2=>" + b2.toString());
        System.out.println("v3=>" + b3.toString());

        System.out.println(tp2);
        System.out.println(tp2.talk());
        System.out.println(tp2.talk());
        System.out.println(tp2.talk());
    }
}
