package pl.sda;

import java.time.LocalDate;

/**
 * @author Remigiusz Zudzin
 */
public abstract class Animal {

    private boolean isAlive;
    private int weight;
    private LocalDate lastEatingDate;

    public void eat() {
        setLastEatingDate(LocalDate.now());
    }

    public Animal() {

    }

    public LocalDate getLastEatingDate() {
        return lastEatingDate;
    }

    public void setLastEatingDate(LocalDate lastEatingDate) {
        this.lastEatingDate = lastEatingDate;
    }

    public Animal(boolean isAlive, int weight, LocalDate lastEatingDate) {
        this.isAlive = isAlive;
        this.weight = weight;
        this.lastEatingDate = lastEatingDate;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
