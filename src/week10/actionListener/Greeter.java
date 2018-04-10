package week10.actionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Greeter {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Greeter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());

        JTextField textField = new JTextField("Enter your name");
        frame.add(textField);

        JButton button = new JButton("Greet");
        frame.add(button);

        button.addActionListener(new MyButtonListener(textField));

        frame.setVisible(true);
    }
}

class MyButtonListener implements ActionListener {
    private JTextField textField;

    public MyButtonListener(JTextField textField) {
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = textField.getText();
        JOptionPane.showMessageDialog(null,
                "Button is clicked. Text is " + text);
    }
}