// https://en.wikipedia.org/wiki/Mandelbrot_set
// https://www.youtube.com/watch?v=NWqvwSJ1-iU

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MandelbrotSet extends JPanel {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int MAX_ITERATIONS = 1000;
    private static final double ZOOM = 200;
    private static final double ESCAPE_THRESHOLD = 4;

    private BufferedImage image;

    public MandelbrotSet() {
        super();
        setPreferredSize(new java.awt.Dimension(WIDTH, HEIGHT));
        image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        calculateMandelbrotSet();
    }

    private void calculateMandelbrotSet() {
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                double zx = 0;
                double zy = 0;
                double cx = (x - WIDTH / 2.0) / ZOOM;
                double cy = (y - HEIGHT / 2.0) / ZOOM;
                int iteration = 0;
                while (zx * zx + zy * zy < ESCAPE_THRESHOLD && iteration < MAX_ITERATIONS) {
                    double tmp = zx * zx - zy * zy + cx;
                    zy = 2 * zx * zy + cy;
                    zx = tmp;
                    iteration++;
                }
                if (iteration == MAX_ITERATIONS) {
                    //set escaped
                    image.setRGB(x, y, Color.WHITE.getRGB());
                } else {
                    //inside set
                    image.setRGB(x, y, Color.BLACK.getRGB());
                }
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mandelbrot Set");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MandelbrotSet mandelbrotSet = new MandelbrotSet();
        frame.setContentPane(mandelbrotSet);
        frame.pack();
        frame.setVisible(true);
    }
}
