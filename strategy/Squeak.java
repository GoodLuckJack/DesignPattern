package com.gtja.pattern.strategy;

public class Squeak implements QuackBehavior{

    @Override
    public void quack() {
        System.out.print("Squeak!");
    }
}
