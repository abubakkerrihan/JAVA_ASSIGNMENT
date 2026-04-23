package five;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class CountryList1 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Country List");

        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        JList<String> list = new JList<>(countries);

        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    System.out.println("Selected: " + list.getSelectedValue());
                }
            }
        });

        frame.add(new JScrollPane(list));
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}