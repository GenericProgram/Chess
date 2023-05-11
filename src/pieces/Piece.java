package pieces;

import javax.swing.*;

import Game.Board;
import Game.Tile;

public abstract class Piece {
    public int moved2;
    private int forwards;
    public final int color;

    public Piece(int color) {
        this.color = color;
        this.moved2 = 0;
        if(getColor() == 0)
        {forwards = 1;}
        else {forwards = -1;}
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

    public int getForwardDirection()
    {
        return forwards;
    }

    public void setForwardDirection(int value){
        forwards = value;
    }
    public abstract boolean isLegalMove(int x, int y, int newX, int newY, Board board, boolean forReal);

}
