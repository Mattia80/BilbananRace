package controller;

import view.GamePanel;
import view.GameWindow;

public class GameManager {
    private static GameManager instance;
    private final GamePanel gamePanel;
    private final GameWindow gameWindow;

    public static GameManager getInstance() {
        if (instance == null) {
            instance = new GameManager();
        }
        return instance;
    }

    private GameManager() {
        this.gamePanel = new GamePanel();
        this.gameWindow = new GameWindow(this.gamePanel);
        this.gamePanel.setFocusable(true);
        this.gamePanel.requestFocus();
    }

    public GamePanel getGamePanel() {
        return gamePanel;
    }

    public GameWindow getGameWindow() {
        return gameWindow;
    }
}
