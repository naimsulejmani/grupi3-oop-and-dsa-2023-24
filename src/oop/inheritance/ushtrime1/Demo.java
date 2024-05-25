package oop.inheritance.ushtrime1;

public class Demo {
    public static void main(String[] args) {
        RuleSet ruleSet = new ChessRules();
        Move move = new PawnMove();
        Board board = new ChessBoard();


        if (ruleSet.isLegal(move, board)) {
            ruleSet.makeMove(move, board);
        }
    }
}
