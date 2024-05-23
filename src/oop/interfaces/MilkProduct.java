package oop.interfaces;

public class MilkProduct implements Perishable {
    private boolean perished = false;

    @Override
    public void perish() {
        perished = true;
    }

    @Override
    public boolean isPerished() {
        return perished;
    }
}
