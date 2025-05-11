package model;

import java.util.Observable;

/**
 * Classe astratta che rappresenta il generico modello di oggetto presente nel gioco.
 * Estende Observable per supportare il pattern Observer/Observable
 */
public abstract class AbstractModel extends Observable {

    protected float startX;
    protected float startY;
    protected int width;
    protected int height;

    /**
     * Costruisce un modello con posizione iniziale e dimensioni
     * @param startX coordinata x di partenza
     * @param startY coordinata y di partenza
     * @param width larghezza dell'elemento
     * @param height altezza dell'elemento
     */
    public AbstractModel(float startX, float startY, int width, int height) {
        this.startX = startX;
        this.startY = startY;
        this.width = width;
        this.height = height;
    }

    /**
     * Restituisce la coordinata x dell'elemento
     * @return la coordinata x dell'elemento
     */
    public float getStartX() {
        return startX;
    }

    /**
     * Imposta la coordinata x dell'elemento
     * @param startX la coordinata x dell'elemento
     */
    public void setStartX(float startX) {
        this.startX = startX;
        setChanged();
        notifyObservers();
    }

    /**
     * Restituisce la coordinata y dell'elemento
     * @return la coordinata y dell'elemento
     */
    public float getStartY() {
        return startY;
    }

    /**
     * Imposta la coordinata y dell'elemento
     * @param startY la coordinata y dell'elemento
     */
    public void setStartY(float startY) {
        this.startY = startY;
        setChanged();
        notifyObservers();
    }

    /**
     * Restituisce la larghezza dell'elemento
     * @return larghezza dell'elemento
     */
    public int getWidth() {
        return width;
    }

    /**
     * Imposta la larghezza dell'elemento
     * @param width larghezza dell'elemento
     */
    public void setWidth(int width) {
        this.width = width;
        setChanged();
        notifyObservers();
    }

    /**
     * Restituisce l'altezza dell'elemento
     * @return altezza dell'elemento
     */
    public int getHeight() {
        return height;
    }

    /**
     * Imposta l'altezza dell'elemento
     * @param height altezza dell'elemento
     */
    public void setHeight(int height) {
        this.height = height;
        setChanged();
        notifyObservers();
    }
}
