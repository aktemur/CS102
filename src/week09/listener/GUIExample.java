package week09.listener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());

        JButton okButton = new JButton("OK");
        JButton cancelButton = new JButton("Cancel");
        frame.add(okButton);
        frame.add(cancelButton);

        ButtonListener listener = new ButtonListener(1);
        okButton.addActionListener(listener);
        cancelButton.addActionListener(listener);

        ButtonListener listener2 = new ButtonListener(2);
        okButton.addActionListener(listener2);

        frame.setVisible(true);
    }
}


class ButtonListener implements ActionListener {
    private int id;
    private int count;

    ButtonListener(int id) {
        this.id = id;
        this.count = 0;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton)e.getSource();

        System.out.println(id + ": hello " + count + " " + source.getText());
        count++;
    }
}
