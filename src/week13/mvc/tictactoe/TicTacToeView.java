package week13.mvc.tictactoe;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.border.EtchedBorder;

public class TicTacToeView extends JFrame {
    protected JComponent[][] components = new JComponent[3][3];

    public TicTacToeView(final TicTacToeController controller) {
        setLayout(new GridLayout(3,3));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                JPanel panel = new JPanel();
                panel.setBorder(new EtchedBorder());
                components[i][j] = panel;
                add(components[i][j]);
                final int row = i;
                final int col = j;
                components[i][j].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent arg0) {
                        // Delegate to the controller 
                        // the task of handling the user action
                        controller.cellClicked(row, col);                        
                    }
                });
            }
        }
    }

    public void updateCell(int i, int j, int playerID) {
        JPanel panel = (JPanel)components[i][j];
        panel.setBackground(playerID == 1 ? Color.RED : Color.BLUE);
        panel.removeMouseListener(panel.getMouseListeners()[0]);
    }

    public void updateTitle(int player) {
        setTitle("Player " + player + "'s turn.");
    }
}