import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ItemSelectionMenu extends JFrame implements ActionListener {
    private JLabel headingLabel;
    private JLabel titleLabel;
    private JButton item1Button;
    private JButton item2Button;
    private JButton item3Button;
    private JButton item4Button;
    private JButton item5Button;

    public ItemSelectionMenu() {
        super("Item Selection Menu");

        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLACK);

        headingLabel = new JLabel("Darksouls Wannabe");
        headingLabel.setFont(new Font("Arial", Font.BOLD, 24));
        headingLabel.setForeground(Color.white);

        titleLabel = new JLabel("Select an item:");
        titleLabel.setForeground(Color.white);
        item1Button = new JButton("Golden Falcon Shield", new ImageIcon(new ImageIcon("item1.png").getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT)));
        item2Button = new JButton("Caduceus Round Shield", new ImageIcon(new ImageIcon("item2.png").getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT)));
        item3Button = new JButton("Moonlight Greatsword", new ImageIcon(new ImageIcon("item3.png").getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT)));
        item4Button = new JButton("Dragonslayer Armor", new ImageIcon(new ImageIcon("item4.png").getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT)));
        item5Button = new JButton("Dragon Greatsword", new ImageIcon(new ImageIcon("item5.png").getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT)));

        setLayout(new GridLayout(7, 1));
        add(headingLabel);
        add(titleLabel);
        add(item1Button);
        add(item2Button);
        add(item3Button);
        add(item4Button);
        add(item5Button);

        item1Button.addActionListener(this);
        item2Button.addActionListener(this);
        item3Button.addActionListener(this);
        item4Button.addActionListener(this);
        item5Button.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        //Can be done in future...
        if (e.getSource() == item1Button) {
            // Code to handle selection of item 1
        } else if (e.getSource() == item2Button) {
            // Code to handle selection of item 2
        } else if (e.getSource() == item3Button) {
            // Code to handle selection of item 3
        } else if (e.getSource() == item4Button) {
            // Code to handle selection of item 4
        }
    }

    public static void main(String[] args) {
        ItemSelectionMenu menu = new ItemSelectionMenu();
    }
}
