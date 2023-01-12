import pieces.Piece;

import javax.swing.*;
import java.awt.*;

public class Tile extends JPanel {
    private Piece piece;
    private int location;
    static final Color tan = new Color(255, 248, 232);
    static final Color red = new Color(215, 122, 97);

    private final Color normalColor;

    public Tile(int location, BorderLayout layout)
    {
        super(layout);
        this.location = location;
        boolean isBlack;
        isBlack = location % 2 == 1;
        if (!((location / 8) % 2 == 0)) {
            isBlack = !isBlack;
        }
        if (!isBlack) {
            normalColor = tan;
        } else {
            normalColor = red;
        }
        setBackground(normalColor);
    }

    public boolean isOccupied()
    {
        return piece != null;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
        for(int i = 0; i < getComponentCount(); i++)
        {
            remove(i);
        }
        if(piece != null)
        {
            JLabel image = new JLabel(piece.getImageIcon());
            add(image);
            revalidate();
            repaint();
        }
    }

    public int getLocationOnBoard()
    {
        return location;
    }

    public Color getColor() {
        return normalColor;
    }
}
