// https://en.wikipedia.org/wiki/Lorenz_system

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class LorenzSystem extends JPanel implements Runnable {
    private static final double SIGMA = 10.0;
    private static final double RHO = 28.0;
    private static final double BETA = 8.0 / 3.0;
    private static final double DT = 0.01;
    private static final int MAX_ITER = 100000;

    private List<Point> points;

    private double x = 1.0;
    private double y = 1.0;
    private double z = 1.0;

    public LorenzSystem() {
        this.points = new ArrayList<>();
        setPreferredSize(new Dimension(800, 600));
    }

    @Override
    public void run() {
        for (int i = 0; i < MAX_ITER; i++) {
            double dx = SIGMA * (y - x);
            double dy = x * (RHO - z) - y;
            double dz = x * y - BETA * z;
            x += DT * dx;
            y += DT * dy;
            z += DT * dz;
            points.add(new Point((int) (x * 10.0), (int) (y * 10.0)));
            repaint();
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Set up the axes
        int x0 = getWidth() / 2;
        int y0 = getHeight() / 2;

        g2d.setColor(Color.BLACK);
        g2d.drawLine(0, y0, getWidth(), y0);
        g2d.drawLine(x0, 0, x0, getHeight());

        // Plot the Lorenz system
        g2d.setColor(Color.RED);
        for (int i = 0; i < points.size() - 1; i++) {
            Point p1 = points.get(i);
            Point p2 = points.get(i + 1);
            int px1 = p1.x + x0;
            int py1 = p1.y + y0;
            int px2 = p2.x + x0;
            int py2 = p2.y + y0;
            g2d.drawLine(px1, py1, px2, py2);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Lorenz System");
        LorenzSystem system = new LorenzSystem();
        frame.add(system);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        new Thread(system).start();
    }
}
