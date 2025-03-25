package SwingDemo;

import javax.swing.*;
import java.awt.*;

public class DemoProgam  extends JFrame {

    JPanel panel = new JPanel();
    JButton b = new JButton("OK");
    JLabel l = new JLabel("Hej");
    JButton b1 = new JButton("OK1");
    JButton b2 = new JButton("OK2");
    JButton b3 = new JButton("OK3");
    JButton b4 = new JButton("OK4");

    public DemoProgam() {

        //panel.setLayout(new GridLayout(3,2));
        panel.setLayout(new BorderLayout());
        add(panel);
        panel.add(b, BorderLayout.SOUTH);
        panel.add(l, BorderLayout.NORTH);
        panel.add(b1, BorderLayout.EAST);
        panel.add(b2, BorderLayout.WEST);
        panel.add(b3, BorderLayout.CENTER);
        panel.add(b4, BorderLayout.EAST);

        //setSize(100, 100);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new DemoProgam();
    }

}
