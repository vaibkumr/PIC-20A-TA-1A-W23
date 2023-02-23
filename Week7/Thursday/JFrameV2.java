import javax.swing.*;

public class JFrameV2 extends JFrame { 
    
    JFrameV2() {
        super("Discussion");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new JFrameV2();
    }
}