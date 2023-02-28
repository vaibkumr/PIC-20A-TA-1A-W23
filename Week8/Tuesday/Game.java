import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game extends JFrame{

    public class MyActionListener implements ActionListener{

        public String itemName;
        public JButton b1;

        public MyActionListener(String s, JButton b1){
            //we need to access the button somehow... this is one way. 
            //the other way is by making b1 an instance member of parent class
            //there is another better way to this... what if the actionlistener becomes a button itself??
            //once you have b1, you dont even need String s, you can just fetch it... How?
            this.itemName = s;
            this.b1 = b1;
        }

        public void actionPerformed(ActionEvent e){
            // System.out.print("A button has been pressed...");
            System.out.print("The item selected is: " + this.itemName + "\n");
        }

    }


    public Game(){
        super("PIC20A Game Menu");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton b1 = new JButton("Metal Armour");
        JButton b2 = new JButton("Metal Sword");
        JButton b3 = new JButton("Metal GreatSword");
        JButton b4 = new JButton("Wooden Armour");


        // MyActionListener obj = new MyActionListener();

        b1.addActionListener(new MyActionListener("Metal Armour", b1));
        b2.addActionListener(new MyActionListener("Metal Sword", b2));
        b3.addActionListener(new MyActionListener("Metal Greatsword", b3));
        b4.addActionListener(new MyActionListener("Wooden Armour", b4));

        // b1.addActionListener(new MyActionListener());        

        add(b1);
        add(b2);
        add(b3);
        add(b4);

        setLayout(new GridLayout(2, 2));

        setVisible(true);
    }

    public static void main(String args[]){
        Game g = new Game();
    }
    
}
