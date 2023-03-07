import javax.swing.JFrame;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TimerTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(100, 100);
        frame.setVisible(true);
        Timer t = new Timer(1000, new Countdown(8));
        t.start();
    }
}
class Countdown implements ActionListener {
    private int i;
    Countdown(int i) {
        this.i = i;
    }
    public void actionPerformed(ActionEvent e) {
        --i;
        System.out.println(i);
        if (i == 0) {
            if (e.getSource() instanceof Timer) {
                ((Timer) e.getSource()).stop();
            }
        }
    }
}