package org.pluralsight.domain;

import org.pluralsight.interfaces.IAnimal;
import org.pluralsight.interfaces.IFlyable;
import org.pluralsight.interfaces.ISwimmable;

public class Dog implements IAnimal, ISwimmable, IFlyable {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
    @Override
    public void swim() {
        System.out.println("I'm swimming!");
    }
    public void fly() {
        System.out.println( "I'm a dog and I'm flying!");
    }
}
