package oop.inheritance.ushtrime1;

public interface RuleSet {
    boolean isLegal(Move move, Board board);

    void makeMove(Move move, Board board);
}
