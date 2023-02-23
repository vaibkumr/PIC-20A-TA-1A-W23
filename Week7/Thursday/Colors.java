import java.awt.*;
import javax.swing.*;

public class Colors {
    public static void main(String args[]){
        JFrame  frame = new JFrame("Hello  Swing");
        JPanel  panel = new JPanel();
        // int val = 128;
        panel.setBackground(new Color(255, 0, 255));        
        panel.setBackground(Color.PINK);        
        frame.add(panel);
        frame.setSize(300, 200);        
        frame.setVisible(true);
    }    
    
}