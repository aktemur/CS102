package week11.snake2;

public class Food extends Item {
    public Food(int x, int y) {
        super(x, y);
    }

    @Override
    public void performAction(SnakeGame game) {
        game.getSnake().grow();
        game.relocate(this);
    }
}
