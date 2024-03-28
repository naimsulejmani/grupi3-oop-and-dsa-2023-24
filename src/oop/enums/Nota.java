package oop.enums;

public enum Nota {
    DOBET(1, "Dobët"),
    MJAFTUESHEM(2, "Mjaftueshëm"),
    MIRE(3, "Mirë"),
    SHUME_MIRE(4, "Shumë mirë"),
    SHKELQYESHEM(5, "Shkelqyeshëm");

    private final int value;
    private final String description;

    Nota(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    public void print() {
        System.out.printf("Vlersimi %s ka vlere %d! %n", description, value);
    }
}







