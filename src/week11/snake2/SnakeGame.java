package week11.snake2;

import java.util.ArrayList;
import java.util.Random;

public class SnakeGame {
    private int width;
    private int height;
    private Snake snake;
    private ArrayList<Item> items;
    private Random random;
    private boolean isFinished;

    public SnakeGame(int width, int height) {
        this.width = width;
        this.height = height;
        random = new Random();
        snake = new Snake(15, 10);
        items = new ArrayList<Item>();
        isFinished = false;

        // Place the walls
        for (int row = 0; row < height; row++) {
            items.add(new Wall(0, row));
            items.add(new Wall(width - 1, row));
        }
        for (int col = 1; col < width-1; col++) {
            items.add(new Wall(col, 0));
            items.add(new Wall(col, height - 1));
        }

        // Start the game with 5 food and 5 poison
        for (int i = 0; i < 10; i++) {
            int x = random.nextInt(width);
            int y = random.nextInt(height);
            if (!isOccupied(x, y)) {
                // Either add a new food or poison
                if (i % 2 == 0) {
                    items.add(new Food(x, y));
                } else {
                    items.add(new Poison(x, y));
                }
            } else {
                // Try again to find an unoccupied location
                i--;
            }
        }
    }

    private boolean isOccupied(int x, int y) {
        SnakeNode head = snake.getNodes().get(0);
        if (head.getX() == x && head.getY() == y)
            return true;
        for (Item item : items) {
            if (item.getX() == x && item.getY() == y)
                return true;
        }
        return false;
    }

    public void moveOneStep() {
        if (!isFinished) {
            snake.move();

            for (Item item : items) {
                if (snake.collidesWith(item)) {
                    item.performAction(this);
                }
            }
        }
    }

    public Snake getSnake() {
        return snake;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void relocate(Item item) {
        while (true) {
            int x = random.nextInt(width);
            int y = random.nextInt(height);
            if (!isOccupied(x, y)) {
                item.setLocation(x, y);
                break;
            }
        }
    }

    public void finish() {
        isFinished = true;
    }

    public boolean isFinished() {
         return isFinished;
    }
}
