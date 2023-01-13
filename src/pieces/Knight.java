package pieces;

import Game.Board;

import javax.swing.*;

public class Knight extends Piece {
    public Knight(int color) {
        super(color);
    }

    @Override
    public ImageIcon getImageIcon() {
        if(color == 0) {
            return(new ImageIcon("src/resources/bKnight.png"));
        } else if(color == 1) {
            return(new ImageIcon("src/resources/wKnight.png"));
        } else {
            return null;
        }
    }

    @Override
    public boolean isLegalMove(int x, int y, int newX, int newY, Board board) {
        int xoffset = newX - x;
        int yoffset = newY - y;
        if (((Math.abs(xoffset) == 1) && (Math.abs(yoffset) == 2)) || ((Math.abs(xoffset) == 2) && (Math.abs(yoffset) == 1))){
            return true;
        }else{
            return false;
        }
    }
}
