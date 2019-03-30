package pl.sda.bears;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sda.Animal;

import java.time.LocalDate;

/**
 * @author Remigiusz Zudzin
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PolarBear extends Animal implements BearInterface {

    private int weight = 50;
    private boolean isAlive = isBearAlive();
    private String attack = "Zabijam!";


    @Override
    public void display() {
        System.out.println("I'm a " + this.getClass().getSimpleName() +  " Waga = " + getWeight() +
                " Czy żywy = " + isBearAlive() + " Atak: " + getAttack());
    }

    @Override
    public boolean isBearAlive() {
        if (getLastEatingDate() == null || getLastEatingDate().isBefore(LocalDate.now().minusDays(10))) {
            setAlive(false);
            return isAlive = false;
        }
        return isAlive = true;
    }

//    public PolarBear() {
//        super();
//        super.isBearAlive();
//        super.setAttack("Zabijam!");
//        this.setWeight(50);
//    }

}
