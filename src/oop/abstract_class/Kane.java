package oop.abstract_class;

public class Kane extends Wrestler {

    public Kane() {
        setPrice(300);
    }

    @Override
    public void themeMusic() {
        System.out.println("Kane Intro music!");
    }

    @Override
    public void finisher() {
        System.out.println("Kane finishing TombStone!");
    }
}
