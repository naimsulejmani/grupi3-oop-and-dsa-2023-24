package oop.polymorphism.finalization;

public final class WarGame extends Game {
    private static final int MAX_NUMBER;


    static {
        MAX_NUMBER = (int) (Math.random() * 100) + 1;
        System.out.println("STATIC->" + MAX_NUMBER);
    }

    private final long serialNumber;

//    {
//        serialNumber=100;
//    }

    public WarGame(int id, String name, long serialNumber) {
        super(id, name);
        this.serialNumber = serialNumber;
        System.out.println("HEY CONSTRUCTORI JAM");

    }

    public WarGame(long serialNumber) {
        this.serialNumber = serialNumber;
    }

//    @Override
//    public int getId() {
//        return super.getId() * 10;
//    }
}
