package week09.layouts;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GridLayoutExample {
	public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);

        JPanel mainPanel = new JPanel();
        frame.add(mainPanel);
                
        mainPanel.setLayout(new GridLayout(3,5));
                
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
