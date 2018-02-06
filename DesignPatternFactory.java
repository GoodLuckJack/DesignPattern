package com.gtja.pattern;

import com.gtja.pattern.strategy.StrategyPerformer;
import com.gtja.pattern.mediator.*;

public class DesignPatternFactory {

    public static final int PERFORMER_MEDIATOR = 1;
    public static final int PERFORMER_STRATEGY = 2;

    public static Performer createPerformer(int performerId) {
        Performer performer = null;
        switch (performerId) {
            case PERFORMER_MEDIATOR:
                performer = new MediatorPerformer();
                break;
            case PERFORMER_STRATEGY:
                performer = new StrategyPerformer();

                break;
        }
        return performer;
    }
}
