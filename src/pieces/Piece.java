package pieces;

import javax.swing.*;

public abstract class Piece {
    public final int color;
    public Piece(int color) {
        this.color = color;
    }

    public ImageIcon getImageIcon() {
        return null;
    }

    public int getColor() {
        return color;
    }

    public boolean isMovable() {
        return true;
    }

    public boolean canJump() {
        return false;
    }

    public boolean isLegalMove(int location, JPanel c, JPanel chessBoard) {
        return true;
    }
}
