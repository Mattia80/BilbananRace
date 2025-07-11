package model;

public abstract class AbstractEntity extends AbstractModel {

    private String idUnivoco;
    private boolean active;

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

    public String getIdUnivoco() {
        return idUnivoco;
    }

    public void setIdUnivoco(String idUnivoco) {
        this.idUnivoco = idUnivoco;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
