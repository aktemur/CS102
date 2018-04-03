package week09.layouts;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BorderLayoutExample {
	public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);

        JPanel mainPanel = new JPanel();
        frame.add(mainPanel);
        frame.add(new JButton("South"), BorderLayout.SOUTH);
        frame.add(new JButton("North"), BorderLayout.NORTH);
        
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(Color.RED);
        
        mainPanel.add(new JButton("CENTER"), BorderLayout.CENTER);
        mainPanel.add(new JTextField("S"), BorderLayout.SOUTH);
        mainPanel.add(new JButton("N"), BorderLayout.NORTH);
        mainPanel.add(new JLabel("W"), BorderLayout.WEST);
        mainPanel.add(new JButton("E"), BorderLayout.EAST);
        
        frame.add(new JButton("Center"), BorderLayout.CENTER);
        frame.setVisible(true);        
	}
}


