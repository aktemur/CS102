package week09.layouts;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Combination {
	public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setMinimumSize(new Dimension(400, 400));

        frame.setLayout(new GridLayout(3,1));
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        
        panel1.setBackground(Color.WHITE);
        panel2.setBackground(Color.BLUE);
        panel3.setBackground(Color.RED);
        
        panel1.setLayout(new BorderLayout());
        panel2.setLayout(new FlowLayout());
        panel3.setLayout(new GridLayout(5,2));
        
        panel1.add(new JLabel("one"), BorderLayout.NORTH);
        panel1.add(new JButton("two"), BorderLayout.CENTER);
        panel1.add(new JTextField("three"), BorderLayout.SOUTH);
        
        panel2.add(new JButton("four"));
        panel2.add(new JLabel("five"));
        panel2.add(new JTextField("six"));
        panel2.add(new JButton("seven"));
        panel2.add(new JLabel("eight"));
        panel2.add(new JButton("ninehundredninetynine"));
        panel2.add(new JLabel("ten"));
        
        panel3.add(new JButton("eleven"));
        panel3.add(new JLabel("twelve"));
        panel3.add(new JTextField("thirteen"));
        panel3.add(new JButton("fourteen"));
        panel3.add(new JLabel("fifteen"));
        panel3.add(new JButton("sixteen"));
        panel3.add(new JLabel("seventeen"));
        panel3.add(new JButton("eighteen"));
        panel3.add(new JLabel("nineteen"));
        panel3.add(new JButton("eighteen"));
        panel3.add(new JLabel("nineteen"));

        frame.setVisible(true);
    }
}
