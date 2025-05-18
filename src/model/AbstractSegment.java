package model;

/**
 * Classe astratta che rappresenta un generico segmento della pista
 */
public abstract class AbstractSegment extends AbstractModel {
    /**
     * Numero di binari (giocatori) sul segmento
     */
    protected int numeroBinari;
    /**
     * Step di rotazione del segmento: 0=0°, 1=90°, 2=180°, 3=270°, 4=360°
     */
    protected int rotationStep;

    /**
     * Costruisce un modello con posizione iniziale e dimensioni
     *
     * @param startX coordinata x di partenza
     * @param startY coordinata y di partenza
     * @param width  larghezza dell'elemento
     * @param height altezza dell'elemento
     */
    public AbstractSegment(float startX, float startY, int width, int height, int numeroBinari) {
        super(startX, startY, width, height);
        this.numeroBinari = numeroBinari;
        this.rotationStep = 0;
    }

    /**
     * Restituisce il numero di binari (giocatori) sul segmento
     *
     * @return numero di binari (giocatori) sul segmento
     */
    public int getNumeroBinari() {
        return numeroBinari;
    }

    /**
     * Imposta il numero di binari (giocatori) sul segmento
     *
     * @param numeroBinari numero di binari (giocatori) sul segmento
     */
    public void setNumeroBinari(int numeroBinari) {
        this.numeroBinari = numeroBinari;
        setChanged();
        notifyObservers();
    }

    /**
     * Restituisce lo step di rotazione del segmento
     * @return lo step di rotazione del segmento
     */
    public int getRotationStep() {
        return rotationStep;
    }

    /**
     * Imposta lo step di rotazione del segmento
     * @param rotationStep lo step di rotazione del segmento
     */
    public void setRotationStep(int rotationStep) {
        this.rotationStep = rotationStep;
    }

    /**
     * Ruota il segmento in senso orario
     */
    public void rotateClockwise() {
        rotationStep = (rotationStep + 1) % 4;
        setChanged();
        notifyObservers();
    }

    /**
     * Ruota il segmento in senso antiorario
     */
    public void rotateCounterClockwise() {
        rotationStep = (rotationStep + 3) % 4;
        setChanged();
        notifyObservers();
    }
}
