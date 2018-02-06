package com.gtja.pattern.strategy;

public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.print("I can't fly!");
    }
}