package oop.mostra_provimi.detyra6_7_8;

public enum Numratori {
    ZERO(0), ONE(1), TWO(2), THREE(3), FOUR(4),
    FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9);

    private final int value;

    Numratori(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String toString() {
        return String.valueOf(value-1);
    }

    public static void main(String[] args) {
        for (var numratori : Numratori.values()) {
            if (numratori.getValue() % 2 == 0) {
                System.out.println(numratori);
            }
        }
    }
}