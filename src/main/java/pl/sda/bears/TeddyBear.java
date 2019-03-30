package pl.sda.bears;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Remigiusz Zudzin
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeddyBear implements BearInterface{

    private int weight = 5;
    private boolean isAlive = false;
    private String attack = "Weź się przytul";

    @Override
    public void display() {
        System.out.println("I'm a " + this.getClass().getSimpleName() +  " Waga = " + getWeight() +
                " Czy żywy = " + isBearAlive() + " Atak: " + getAttack());
    }

    @Override
    public boolean isBearAlive() {
        return isAlive;
    }


//    public TeddyBear() {
//        super.setAlive(false);
//        super.setAttack("Weź się przytul");
//        super.setWeight(5);
//    }

}
