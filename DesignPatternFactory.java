package com.gtja.pattern;

import com.gtja.pattern.mediator.*;

public class DesignPatternFactory {

    public static final int PERFORMER_MEDIATOR = 1;

    public static Performer createPerformer(int performerId) {
        Performer performer = null;
        switch (performerId) {
            case PERFORMER_MEDIATOR:
                performer = new MediatorPerformer();
                break;
        }
        return performer;
    }
}
