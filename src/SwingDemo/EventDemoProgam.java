package SwingDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDemoProgam extends JFrame implements ActionListener {

    JPanel panel = new JPanel();
    JButton b = new JButton("OK5");
    JLabel l = new JLabel("Ingen knapp tryckt än");
    JButton b1 = new JButton("OK1");
    JButton b2 = new JButton("OK2");
    JButton b3 = new JButton("OK3");
    JButton b4 = new JButton("OK4");

    public EventDemoProgam() {

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b.addActionListener(this);

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
        new EventDemoProgam();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        l.setText(((JButton)e.getSource()).getText());

    /*    if (e.getSource() == b) {
            l.setText("OK5 pressed");
        }
        else if (e.getSource() == b1) {
            l.setText("OK1 pressed");
        }
        else if (e.getSource() == b2) {
            l.setText("OK2 pressed");
        }
        else if (e.getSource() == b3) {
            l.setText("OK3 pressed");
        }
        else if (e.getSource() == b4) {
            l.setText("OK4 pressed");
        }*/
    }
}
