package view;

import javax.swing.*;
import java.awt.*;

/**
 * Classe che rappresenta il Panel che sara' contenuto nel GameWindow e su cui verra' disegnato il gioco
 */
public class GamePanel extends JPanel {

    /**
     * Costruisce un GamePanel con dimensioni definite e sfondo nero
     */
    public GamePanel() {
        this.setSize();
        this.setBackground(Color.BLACK);
    }

    /**
     * Metodo privato che imposta le dimensioni del GamePanel
     */
    private void setSize() {
        Dimension dimension = new Dimension(1280, 720);
        this.setPreferredSize(dimension);
        this.setMinimumSize(dimension);
        this.setMaximumSize(dimension);
    }

    /**
     * Metodo che disegna il gioco sul GamePanel
     * @param g oggetto grafico per disegnare sul JFrame
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
