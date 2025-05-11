package model;

/**
 * Classe astratta che rappresenta un generico segmento della pista
 */
public abstract class AbstractSegment extends AbstractModel {
    protected int numeroBinari;

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
}
