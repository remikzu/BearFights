package pl.sda.bears;

/**
 * @author Remigiusz Zudzin
 */
public interface BearInterface {

    int weight = 0;
    boolean isAlive = false;
    String attack = "";

    void display();
    boolean isBearAlive();



}
