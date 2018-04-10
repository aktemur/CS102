package week10.drag2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseInteractionExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 350);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);
        frame.add(mainPanel);

        JPanel rectangle1 = new JPanel();
        rectangle1.setBackground(Color.RED);
        mainPanel.add(rectangle1);
        rectangle1.setBounds(40, 20, 60, 90);

        JPanel rectangle2 = new JPanel();
        rectangle2.setBackground(Color.BLUE);
        mainPanel.add(rectangle2);
        rectangle2.setBounds(80, 100, 120, 40);

        JPanel rectangle3 = new JPanel();
        rectangle3.setBackground(Color.GREEN);
        mainPanel.add(rectangle3);
        rectangle3.setBounds(50, 150, 80, 80);

        MyMouseListener myMouseListener = new MyMouseListener();
        mainPanel.addMouseListener(myMouseListener);
        mainPanel.addMouseMotionListener(myMouseListener);

        frame.setVisible(true);
    }
}

class MyMouseListener extends MouseAdapter {
    private int prevX;
    private int prevY;
    private JPanel rectangle;

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Clicked at " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        prevX = e.getX();
        prevY = e.getY();
        JPanel mainPanel = (JPanel)e.getSource();
        JPanel selectedPanel = (JPanel)mainPanel.getComponentAt(e.getX(), e.getY());
        // getComponentAt may return the mainPanel itself if no component contains the given location
        if (selectedPanel != mainPanel) {
            rectangle = selectedPanel;
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        rectangle = null;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Dragged at " + e.getX() + ", " + e.getY());
        int dx = e.getX() - prevX;
        int dy = e.getY() - prevY;

        if (rectangle != null) {
            rectangle.setLocation(rectangle.getX() + dx, rectangle.getY() + dy);
        }

        prevX = e.getX();
        prevY = e.getY();
    }
}
