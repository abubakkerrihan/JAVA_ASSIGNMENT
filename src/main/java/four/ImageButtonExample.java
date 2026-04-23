package four;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Image Buttons");

        // Load images (make sure images exist in project folder)
        ImageIcon clockIcon = new ImageIcon("clock.png");
        ImageIcon hourglassIcon = new ImageIcon("hourglass.png");

        JButton btnClock = new JButton(clockIcon);
        JButton btnHourglass = new JButton(hourglassIcon);

        JLabel label = new JLabel("Click an image button");
        label.setHorizontalAlignment(JLabel.CENTER);

        frame.setLayout(new FlowLayout());
        frame.add(btnClock);
        frame.add(btnHourglass);
        frame.add(label);

        // Event Handling
        btnClock.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Digital Clock is pressed");
            }
        });

        btnHourglass.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hour Glass is pressed");
            }
        });

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}