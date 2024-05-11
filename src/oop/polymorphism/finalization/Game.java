package oop.polymorphism.finalization;

public class Game {
    private int id;
    private String name;

    public Game(final int id, final String name) {
//        id *= 10;
        this.id = id;
        this.name = name;
    }

    public Game() {
    }

    public final int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
