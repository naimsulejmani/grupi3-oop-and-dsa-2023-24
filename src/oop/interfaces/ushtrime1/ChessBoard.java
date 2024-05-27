package oop.interfaces.ushtrime1;

public class ChessBoard implements Board{

    Object[][] chessBoard = new Object[8][8];

    @Override
    public Board getBoard() {
        return this;
    }
}
