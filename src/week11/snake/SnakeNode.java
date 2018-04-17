package week11.snake;

public class SnakeNode {
    private static final int WEST = 0;
    private static final int EAST = 1;
    private static final int SOUTH = 2;
    private static final int NORTH = 3;

    private int direction;
    private int x;
    private int y;

    public SnakeNode(int x, int y) {
        this.direction = WEST;
        this.x = x;
        this.y = y;
    }

    public void move() {
        move(1);
    }

    public void moveBackwards() {
        move(-1);
    }

    private void move(int step) {
        if (direction == WEST) {
            x = x - step;
        } else if (direction == EAST) {
            x = x + step;
        } else if (direction == SOUTH) {
            y = y + step;
        } else if (direction == NORTH) {
            y = y - step;
        }
    }

    public void turnLeft() {
        if (direction == WEST) {
            direction = SOUTH;
        } else if (direction == EAST) {
            direction = NORTH;
        } else if (direction == SOUTH) {
            direction = EAST;
        } else if (direction == NORTH) {
            direction = WEST;
        }
    }

    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }
}
