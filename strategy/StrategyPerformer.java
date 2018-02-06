package com.gtja.pattern.strategy;

import com.gtja.pattern.Performer;

public class StrategyPerformer extends Performer{

    @Override
    public void perform() {
        Duck duck = new ModelDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();

    }
}
