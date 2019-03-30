package pl.sda.bears;

import pl.sda.Animal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Remigiusz Zudzin
 */


public abstract class Bear extends Animal {

    private int weight;
    private boolean isAlive;
    private String attack;

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public void display() {
        System.out.println("I'm a " + this.getClass().getSimpleName() + " Waga = " + getWeight() +
                " Czy żywy = " + isBearAlive() + " Atak: " + getAttack());
    }

    public boolean isBearAlive() {
        if (getLastEatingDate() == null || getLastEatingDate().isBefore(LocalDate.now().minusDays(10))) {
            setAlive(false);
            return isAlive = false;
        }
        return isAlive = true;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean isAlive() {
        return isAlive;
    }
}
