import javax.swing.*;

public class JFrameV2 extends JFrame { 
    
    JFrameV2() {
        super("Discussion");
        setSize(400, 400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new JFrameV2();
    }
}