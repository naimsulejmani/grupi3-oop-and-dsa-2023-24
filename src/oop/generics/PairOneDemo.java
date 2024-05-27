package oop.generics;

public class PairOneDemo {
    public static void main(String[] args) {
        PairOne<String> pair1 = new PairOne<>("emri", "Naim");
        PairOne<Double> pair2 = new PairOne<>(20.2, 33.2);

    }
}
