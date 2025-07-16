package model;

public class Player extends AbstractEntity {

    private String name;
    private long score;
    private String vehicle;
    private float vehicleSpeed;

    /**
     * Costruisce un Player con posizione iniziale e dimensioni
     *
     * @param startX coordinata x di partenza
     * @param startY coordinata y di partenza
     * @param width  larghezza dell'elemento
     * @param height altezza dell'elemento
     */
    public Player(float startX, float startY, int width, int height) {
        super(startX, startY, width, height);
        this.score = 0;
        this.vehicleSpeed = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getScore() {
        return score;
    }

    public void setScore(long score) {
        this.score = score;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public float getVehicleSpeed() {
        return vehicleSpeed;
    }

    public void setVehicleSpeed(float vehicleSpeed) {
        this.vehicleSpeed = vehicleSpeed;
    }

}
