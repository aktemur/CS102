package week11.snake2;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static final int WIDTH = 300;
    public static final int HEIGHT = 300;

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Snake");
        frame.setLayout(new BorderLayout());
        frame.setSize(WIDTH, HEIGHT + 20);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SnakeGame game = new SnakeGame(WIDTH / GameView.CELL_SIZE, HEIGHT / GameView.CELL_SIZE);
        GameView view = new GameView(game);

        frame.add(view);
        frame.setVisible(true);
        // This is needed to make the game panel respond to key strokes
        view.requestFocusInWindow();

        // Forever keep moving
        while(true) {
            if (game.isFinished())
                break;
            game.moveOneStep();
            view.repaint();
            Thread.currentThread().sleep(400);
        }
        JOptionPane.showMessageDialog(null, "YOU LOST!!!");
    }
}
