package com.gtja.pattern.strategy;

public class MuteQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.print("Quack");
    }
}
