package week11.snake2;

public class Wall extends Item {
    public Wall(int x, int y) {
        super(x, y);
    }

    @Override
    public void performAction(SnakeGame game) {
        game.finish();
    }
}
