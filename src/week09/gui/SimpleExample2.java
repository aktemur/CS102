package week09.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleExample2 {
	public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 200);
        frame.setTitle("My App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel mainPanel = new JPanel();
        frame.add(mainPanel);
        
        JButton button = new JButton("ABCDEF");
        mainPanel.add(button);
        
        JTextField field = new JTextField();
        field.setText(button.getText());
        mainPanel.add(field);        

        mainPanel.remove(button);
        
        frame.setVisible(true);
	}
}

