package com.gtja.pattern.mediator;

public class AbstractColleague {
    protected AbstractMediator abstractMediator;

    public AbstractColleague(AbstractMediator mediator) {
        abstractMediator = mediator;
    }
}
