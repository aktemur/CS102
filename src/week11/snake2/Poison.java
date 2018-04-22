package week11.snake2;

public class Poison extends Item {
    public Poison(int x, int y) {
        super(x, y);
    }

    @Override
    public void performAction(SnakeGame game) {
        game.getSnake().shrink();
        game.relocate(this);
    }
}
