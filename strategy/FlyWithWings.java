package com.gtja.pattern.strategy;

public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.print("I'm flying!");
    }
}
