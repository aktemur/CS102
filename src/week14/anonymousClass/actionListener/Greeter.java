package week14.anonymousClass.actionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Greeter extends JFrame {
    private JTextField textField;
    private JLabel label;
    private JButton button;

    public Greeter(String title) {
        super(title);
        textField = new JTextField("Enter your name");
        add(textField);
        label = new JLabel("I am a label.");
        add(label);
        button = new JButton("Greet");
        add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                label.setText(text);
            }
        });
    }
}


