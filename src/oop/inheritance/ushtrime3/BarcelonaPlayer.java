package oop.inheritance.ushtrime3;

public class BarcelonaPlayer extends PlayerAdapter {
    @Override
    public void wish() {
        System.out.println("Kam pas deshire me lujt per Realin, po qe!");
    }

    @Override
    public boolean skip() {
        System.out.println("Skip prej titullit!");
        return true;
    }
}
