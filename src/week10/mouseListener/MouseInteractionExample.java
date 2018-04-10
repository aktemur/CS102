package week10.mouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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

        rectangle.addMouseListener(new MyMouseListener());

        frame.setVisible(true);
    }
}

class MyMouseListener implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Clicked at " + e.getX() + ", " + e.getY());
        JPanel panel = (JPanel)e.getSource();
        panel.setBackground(Color.BLUE);
        panel.setLocation(panel.getX() + 10, panel.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Pressed at " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Released at " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Exited");
    }
}
