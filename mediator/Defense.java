package com.gtja.pattern.mediator;

public class Defense extends AbstractColleague{

    public Defense(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    public void fight() {
        super.abstractMediator.manageAffairs(Mediator.AFFAIR_DEFENSE);
    }

    public void doSelfWork() {
        System.out.print("兵部：要人没问题，我尽量抓多几个壮丁.\n");
    }
}
