package oop.inheritance.ushtrime1;

public class ChessRules implements RuleSet {
    @Override
    public boolean isLegal(Move move, Board board) {
        // kontrollo se levizja qe eshte be a eshte legale
        return false;
    }

    @Override
    public void makeMove(Move move, Board board) {
        // nese eshte legale levize, perndryshe mos e leviz figuren
    }
}
