package week10.drag1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
        rectangle.addMouseMotionListener(myMouseListener);

        frame.setVisible(true);
    }
}

class MyMouseListener extends MouseAdapter {
    private int prevX;
    private int prevY;

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Clicked at " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        prevX = e.getXOnScreen();
        prevY = e.getYOnScreen();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Dragged at " + e.getX() + ", " + e.getY());
        JPanel panel = (JPanel)e.getSource();
        int dx = e.getXOnScreen() - prevX;
        int dy = e.getYOnScreen() - prevY;
        panel.setLocation(panel.getX() + dx, panel.getY() + dy);
        prevX = e.getXOnScreen();
        prevY = e.getYOnScreen();
    }
}
