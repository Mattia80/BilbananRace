package model;

public abstract class AbstractEntity extends AbstractModel {

    private boolean moving;
    private float speed;
    private int id;


    /**
     * Costruisce un modello con posizione iniziale e dimensioni
     *
     * @param startX coordinata x di partenza
     * @param startY coordinata y di partenza
     * @param width  larghezza dell'elemento
     * @param height altezza dell'elemento
     */
    public AbstractEntity(float startX, float startY, int width, int height) {
        super(startX, startY, width, height);
    }
}
