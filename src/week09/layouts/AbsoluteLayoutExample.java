package week09.layouts;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AbsoluteLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
        JPanel mainPanel = new JPanel();
        frame.add(mainPanel);
        mainPanel.setLayout(null);
        
        JButton button = new JButton("I am a Button");
        button.setBounds(10, 10, 200, 60);
        mainPanel.add(button);

        JTextField field = new JTextField("My size is manually set...");
        field.setBounds(10, 90, 90, 40);
        mainPanel.add(field);

        frame.setVisible(true);
    }
}





