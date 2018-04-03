package week09.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleExample1 {
	public static void main(String[] args) {
        JFrame frame = new JFrame("CS 102 App");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        frame.add(mainPanel);
        
        JButton button = new JButton("I am a Button");
        mainPanel.add(button);
        
        frame.setVisible(true);
	}
}





