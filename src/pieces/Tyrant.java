package pieces;

import Game.Board;
import Game.Tile;

import javax.swing.*;

public class Tyrant extends Piece {
    public Tyrant(int color) {
        super(color);
        value = 4;
        this.royal = true;
    }

    @Override
    public ImageIcon getImageIcon() {
        if(color == 0) {
            return(new ImageIcon("src/resources/bTyrant.png"));
        } else if(color == 1) {
            return(new ImageIcon("src/resources/wTyrant.png"));
        } else {
            return null;
        }
    }

    @Override
    public boolean isLegalMove(int x, int y, int newX, int newY, Board board, boolean forReal) {
        int dx = newX - x;
        int dy = newY - y;
        Tile destination = board.getTile(Board.getLocationFromCords(newX, newY));
        return (Moves.allClear(getColor(), destination) && Moves.pegasusMove(x, y, dx, dy, board));
    }
}