package com.gtja.pattern.mediator;

public class Ministry extends AbstractColleague{

    public Ministry(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    public void buildPalace() {
        super.abstractMediator.manageAffairs(Mediator.AFFAIR_MINISTRY);
    }

    public void doSelfWork() {
        System.out.print("户部：专挑轻活，其他的找别人干去。\n");
    }
}
