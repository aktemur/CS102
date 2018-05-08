package week14.innerClass.snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameView extends JPanel {
    public static final int CELL_SIZE = 15;

    private SnakeGame game;

    public GameView(SnakeGame game) {
        this.game = game;
        // Make the game listen to key events
        addKeyListener(new KeyHandler());
    }

    // Key event listener.
    class KeyHandler extends KeyAdapter {
        public void keyPressed(KeyEvent event) {
            if(event.getKeyCode() == KeyEvent.VK_LEFT) {
                game.getSnake().turnLeft();
                System.out.println("LEFT");
            } else if(event.getKeyCode() == KeyEvent.VK_RIGHT) {
                game.getSnake().turnRight();
                System.out.println("RIGHT");
            } else if(event.getKeyCode() == KeyEvent.VK_G) {
                game.getSnake().grow();
                System.out.println("GROW");
            }
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        drawGridOn(g);
        drawSnakeOn(g);
        drawFoodOn(g);
    }

    private void drawGridOn(Graphics g) {
        g.setColor(Color.BLACK);
        for (int i = 0; i < getWidth(); i += CELL_SIZE) {
            for (int j = 0; j < getHeight(); j += CELL_SIZE) {
                g.drawLine(i, 0, i, getHeight());
                g.drawLine(0, j, getWidth(), j);
            }
        }
    }

    private void drawSnakeOn(Graphics g) {
        g.setColor(Color.BLUE);
        Snake snake = game.getSnake();
        for (SnakeNode node : snake.getNodes()) {
            g.fillOval(node.getX() * CELL_SIZE, node.getY() * CELL_SIZE,
                    CELL_SIZE, CELL_SIZE);
        }
    }

    private void drawFoodOn(Graphics g) {
        g.setColor(Color.GREEN);
        Food food = game.getFood();
        g.fillOval(food.getX() * CELL_SIZE, food.getY() * CELL_SIZE,
                CELL_SIZE, CELL_SIZE);
    }
}
