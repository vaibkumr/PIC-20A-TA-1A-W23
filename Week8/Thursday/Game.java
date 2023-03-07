import javax.swing.*;
import javax.swing.undo.CompoundEdit;

import java.awt.*;
import java.awt.event.*;

public class Game extends JFrame{

    public Game(){
        super("PIC20A Game Menu");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Tile b1 = new Tile("Metal Armour");
        Tile b2 = new Tile("Metal Sword");
        Tile b3 = new Tile("Metal GreatSword");
        Tile b4 = new Tile("Wooden Armour");

        add(b1);
        add(b2);
        add(b3);
        add(b4);

        setLayout(new GridLayout(2, 2));
        setVisible(true);
    }



    class Tile extends JButton {
        int row, col;


        public Tile(String text){
            super(text);
            // Tile (this) --> is a JButton aka a component
            // Tile (this) --> is also implementing ActionListener
            this.addActionListener(this);
        }

        public void actionPerformed(ActionEvent e){
            // check if move is valid
            // changeTheButton Text (setText)
            // We have access to row and col of the tile that has been clicked
            // state.applyMove
            // someoneWon
        }         
    }


    public static void main(String args[]){
        Game g = new Game();
    }
    
}
