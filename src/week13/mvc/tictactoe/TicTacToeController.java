package week13.mvc.tictactoe;

import javax.swing.JOptionPane;

public class TicTacToeController {
    private TicTacToeModel grid;
    private TicTacToeView view;

    public TicTacToeController(TicTacToeModel grid) {
        this.grid = grid;
        this.view = new TicTacToeView(this);
    }

    public void startGame() {
        view.setSize(300,300);        
        view.setVisible(true);
    }

    public void cellClicked(int row, int col) {
        int currentPlayer = grid.getCurrentPlayer();
        grid.markCell(row, col);
        int nextPlayer = grid.getCurrentPlayer();
        view.updateCell(row, col, currentPlayer);
        view.updateTitle(nextPlayer);
        if(grid.hasWinningCondition()) {
            JOptionPane.showMessageDialog(view, "Player " + currentPlayer + " has won!!!");
            System.exit(0);
        } else if(grid.hasTieCondition()) {
            JOptionPane.showMessageDialog(view, "Game tied!!!");
            System.exit(0);
        }
    }
}

