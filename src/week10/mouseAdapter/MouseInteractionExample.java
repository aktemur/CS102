package week10.mouseAdapter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseInteractionExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);
        frame.add(mainPanel);

        JPanel rectangle = new JPanel();
        rectangle.setBackground(Color.RED);
        mainPanel.add(rectangle);
        rectangle.setBounds(40, 20, 60, 90);

        MyMouseListener myMouseListener = new MyMouseListener();
        rectangle.addMouseListener(myMouseListener);

        frame.setVisible(true);
    }
}

class MyMouseListener extends MouseAdapter {
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Clicked at " + e.getX() + ", " + e.getY());
    }
}
