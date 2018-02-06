package com.gtja.pattern.strategy;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.print("I'm a model duck!");
    }
}
