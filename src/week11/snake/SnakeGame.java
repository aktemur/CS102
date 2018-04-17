package week11.snake;

import java.util.Random;

public class SnakeGame {
    private int width;
    private int height;
    private Snake snake;
    private Food food;
    private Random random;

    public SnakeGame(int width, int height) {
        this.width = width;
        this.height = height;
        random = new Random();
        snake = new Snake(15, 10);
        food = new Food(random.nextInt(width), random.nextInt(height));
    }

    public void moveOneStep() {
        snake.move();

        if (snake.canEat(food)) {
            snake.grow();
            food.setLocation(random.nextInt(width), random.nextInt(height));
        }
    }

    public Snake getSnake() {
        return snake;
    }

    public Food getFood() {
        return food;
    }
}
