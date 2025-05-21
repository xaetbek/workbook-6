package org.pluralsight.domain;

import org.pluralsight.interfaces.IAnimal;

public class Cat implements IAnimal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
