package week15.snakesAndLadders.gui;

import week15.snakesAndLadders.model.BoardBuilder;
import week15.snakesAndLadders.model.Game;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Game game = new Game(BoardBuilder.get6x6Board(), 2);
        GUI gui = new GUI(game, "src/week15/snakesAndLadders/board6x6.jpg", 6, 6);
        Controller controller = new Controller(game, gui);
        controller.start();
    }
}
