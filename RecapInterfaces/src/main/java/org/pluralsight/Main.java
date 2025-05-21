package org.pluralsight;

import org.pluralsight.domain.Bird;
import org.pluralsight.domain.Dog;
import org.pluralsight.domain.Eagle;
import org.pluralsight.interfaces.IFlyable;
import org.pluralsight.interfaces.ISwimmable;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IFlyable bird = new Bird();
        bird.fly();

        ISwimmable swimmableDog = new Dog();
        swimmableDog.swim();

        List<IFlyable> flyers = new ArrayList<>();
        flyers.add(new Bird());
        flyers.add(new Eagle());
        flyers.add(new Eagle());
        flyers.add(new Bird());
        flyers.add(new Bird());
        flyers.add(new Dog());

        for (IFlyable f : flyers) {
            f.fly();  // all fly differently, but we treat them the same!
        }

        launchIntoSky(new Eagle());

    }

    public static void launchIntoSky(IFlyable flyer) {
        flyer.fly();
    }

}