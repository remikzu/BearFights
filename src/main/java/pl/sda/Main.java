package pl.sda;

import pl.sda.bears.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author Remigiusz Zudzin
 */
public class Main {

    public static List<? super BearInterface> addAnimals() {
        PolarBear polarBear1 = new PolarBear();
        polarBear1.eat();
        polarBear1.display();
        PolarBear polarBear2 = new PolarBear();
        polarBear2.eat();
        polarBear2.display();
        PolarBear polarBear3 = new PolarBear();
        polarBear3.eat();
        polarBear3.display();

        BrownBear brownBear1 = new BrownBear();
        brownBear1.eat();
        brownBear1.display();
        BrownBear brownBear2 = new BrownBear();
        brownBear2.eat();
        brownBear2.display();
        BrownBear brownBear3 = new BrownBear();
        brownBear3.eat();
        brownBear3.display();

        BlackBear blackBear1 = new BlackBear();
        blackBear1.eat();
        blackBear1.display();
        BlackBear blackBear2 = new BlackBear();
        blackBear2.eat();
        blackBear2.display();
        BlackBear blackBear3 = new BlackBear();
        blackBear3.eat();
        blackBear3.display();

        TeddyBear teddyBear1 = new TeddyBear();
        teddyBear1.display();
        TeddyBear teddyBear2 = new TeddyBear();
        teddyBear2.display();
        TeddyBear teddyBear3 = new TeddyBear();
        teddyBear3.display();

        List<? super BearInterface> zoo = new ArrayList<>();
        zoo.add(polarBear1);
        zoo.add(polarBear2);
        zoo.add(polarBear3);
        zoo.add(brownBear1);
        zoo.add(brownBear2);
        zoo.add(brownBear3);
        zoo.add(teddyBear3);
        zoo.add(blackBear1);
        zoo.add(blackBear2);
        zoo.add(blackBear3);
        zoo.add(teddyBear1);
        zoo.add(teddyBear2);

        return zoo;
    }

    static void checkWhoWon(List<? super BearInterface> list) {


        Random random = new Random();
        int count = 0;
        while(list.size() > 1) {
            Collections.shuffle(list);
            for (int i = 0; i < list.size()-1; i++) {
                int chance = random.nextInt(4);
                if (chance == 1) {
                    if (list.get(i) instanceof PolarBear) {
                        System.out.println("Polar Bear kills: " + list.get(i + 1).getClass().getSimpleName());
                        list.remove(list.get(i + 1));
                    } else if (list.get(i) instanceof TeddyBear) {
                        System.out.println(list.get(i).getClass().getSimpleName() + " przytula " + list.get(i + 1).getClass().getSimpleName());
                    } else {
                        System.out.println(list.get(i).getClass().getSimpleName() + " only hurts " +
                                list.get(i + 1).getClass().getSimpleName());
                    }
                }
            }
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {

        List<? super BearInterface> list = addAnimals();
        checkWhoWon(list);



    }

}
