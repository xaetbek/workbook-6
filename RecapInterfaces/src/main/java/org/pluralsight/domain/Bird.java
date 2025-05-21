package org.pluralsight.domain;

import org.pluralsight.interfaces.IFlyable;

public class Bird implements IFlyable {
    @Override
    public void fly(){
        System.out.println("I'm flying!");
    }
}
