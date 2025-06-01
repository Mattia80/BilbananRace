package view;

import javax.swing.*;

/**
 * Classe che rappresenta il JFrame necessario per visualizzare il gioco
 */
public class GameWindow {
    private final GamePanel gamePanel;

    /**
     * Costruisce un JFrame con un GamePanel associato
     * @param gamePanel GamePanel associato al JFrame
     */
    public GameWindow(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
        JFrame frame = new JFrame("Bilbanan Race");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(gamePanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    /**
     * Restituisce il GamePanel associato al JFrame
     * @return GamePanel associato al JFrame
     */
    public GamePanel getGamePanel() {
        return gamePanel;
    }
}
