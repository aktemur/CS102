package week11.snake2;

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
        addKeyListener(new KeyHandler(game.getSnake()));
    }

    public void paint(Graphics g) {
        super.paint(g);
        drawGridOn(g);
        drawSnakeOn(g);
        drawItemsOn(g);
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

    private void drawItemsOn(Graphics g) {
        for (Item item : game.getItems()) {
            if (item instanceof Food) {
                g.setColor(Color.GREEN);
            } else if (item instanceof Poison) {
                g.setColor(Color.RED);
            } else {
                g.setColor(Color.BLACK);
            }
            g.fillOval(item.getX() * CELL_SIZE, item.getY() * CELL_SIZE, CELL_SIZE, CELL_SIZE);
        }
    }
}

// Key event listener.
class KeyHandler extends KeyAdapter {
    private Snake snake;

    public KeyHandler(Snake snake) {
        this.snake = snake;
    }

    public void keyPressed(KeyEvent event) {
        if(event.getKeyCode() == KeyEvent.VK_LEFT) {
            snake.turnLeft();
            System.out.println("LEFT");
        } else if(event.getKeyCode() == KeyEvent.VK_RIGHT) {
            snake.turnRight();
            System.out.println("RIGHT");
        } else if(event.getKeyCode() == KeyEvent.VK_G) {
            snake.grow();
            System.out.println("GROW");
        }
    }
}
