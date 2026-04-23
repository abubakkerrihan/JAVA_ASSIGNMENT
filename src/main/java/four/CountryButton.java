package four;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountryButton {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Country Buttons");
        JButton btnIndia = new JButton("India");
        JButton btnSrilanka = new JButton("Srilanka");
        JLabel label = new JLabel("Click a button");

        label.setHorizontalAlignment(JLabel.CENTER);

        // Layout
        frame.setLayout(new FlowLayout());
        frame.add(btnIndia);
        frame.add(btnSrilanka);
        frame.add(label);

        // Event Handling
        btnIndia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("India is pressed");
            }
        });

        btnSrilanka.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Srilanka is pressed");
            }
        });

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}