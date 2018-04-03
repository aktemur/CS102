package week09.layouts;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FlowLayoutExample {
	public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
        JPanel mainPanel = new JPanel();
        frame.add(mainPanel);
        
        mainPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
 
        mainPanel.add(new JLabel("one"));
        mainPanel.add(new JButton("two"));
        mainPanel.add(new JTextField("three"));
        mainPanel.add(new JButton("four"));
        mainPanel.add(new JLabel("five"));
        mainPanel.add(new JTextField("six"));
        mainPanel.add(new JButton("seven"));
        mainPanel.add(new JLabel("eight"));
        mainPanel.add(new JButton("ninehundredninetynine"));
        mainPanel.add(new JLabel("ten"));

        frame.setVisible(true);
    }
}
