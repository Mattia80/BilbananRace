package model;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

public class Rettilineo extends AbstractSegment {

    /**
     * Costruisce un modello con posizione iniziale e dimensioni
     *
     * @param startX       coordinata x di partenza
     * @param startY       coordinata y di partenza
     * @param width        larghezza del rettilineo
     * @param height       altezza del rettilineo
     * @param numeroBinari numero di binari (giocatori) sul rettilineo
     */
    public Rettilineo(float startX, float startY, int width, int height, int numeroBinari) {
        super(startX, startY, width, height, numeroBinari);
    }

    /**
     * Calcola la coordinata y centrale della corsia indicata
     *
     * @param laneIndex indice della corsia (la prima corsia è 0)
     * @return la coordinata y centrale della corsia indicata
     * @throws IllegalArgumentException se laneIndex non è valido
     */
    public float getLaneCenterY(int laneIndex) {
        if (laneIndex < 0 || laneIndex >= numeroBinari) {
            throw new IllegalArgumentException("Indice di corsia non valido" + laneIndex);
        }
        float laneHeight = (float) (height / numeroBinari);
        return startY + laneHeight * (laneIndex + 0.5f);
    }

    /**
     * Restituisce le coordinate centrali delle corsie del rettilineo, considerando la rotazione
     *
     * @return le coordinate centrali delle corsie del rettilineo, considerando la rotazione
     */
    public List<Point2D.Float> getLaneCenterPosition() {
        List<Point2D.Float> centers = new ArrayList<>();

        for (int i = 0; i < numeroBinari; i++) {
            float centerX, centerY;

            centerY = switch (rotationStep) {
                case 1 -> {
                    centerX = startX + (i * 0.5f) * (width / (float) numeroBinari);
                    yield startY + height / 2f;
                }
                case 2 -> {
                    centerX = startX + width / 2f;
                    yield startY + (numeroBinari - 1 - i * 0.5f) * (height / (float) numeroBinari);
                }
                case 3 -> {
                    centerX = startX + (i * 0.5f) * (width / (float) numeroBinari);
                    yield startY - height / 2f;
                }
                default -> {
                    centerX = startX + width / 2f;
                    yield startY + (i * 0.5f) * (height / (float) numeroBinari);
                }
            };
            centers.add(new Point2D.Float(centerX, centerY));
        }
        return centers;
    }

    /**
     * Calcola le coordinate del punto finale del rettilineo in base alla rotazione
     *
     * @return le coordinate del punto finale del rettilineo in base alla rotazione
     */
    public Point2D.Float getEndPoint() {
        float endX, endY;
        endY = switch (rotationStep) {
            case 1 -> {
                endX = startX;
                yield startY + height;
            }
            case 2 -> {
                endX = startX - width;
                yield startY;
            }
            case 3 -> {
                endX = startX;
                yield startY - height;
            }
            default -> {
                endX = startX + width;
                yield startY;
            }
        };
        return new Point2D.Float(endX, endY);
    }
}
