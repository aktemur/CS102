package week11.snake2;

public abstract class Item {
    private int x;
    private int y;

    public Item(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void performAction(SnakeGame game);
}
