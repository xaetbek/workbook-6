package org.pluralsight.domain;

import org.pluralsight.interfaces.IFlyable;

public class Eagle implements IFlyable {
    @Override
    public void fly() {
        System.out.println("I'm flying super fast!");
    }
}
