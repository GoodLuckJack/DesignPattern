package com.gtja.pattern.mediator;

public class Department extends AbstractColleague{

    public Department(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    public void dealDisaster() {
        super.abstractMediator.manageAffairs(Mediator.AFFAIR_DEPARTMENT);
    }

    public void doSelfWork() {
        System.out.print("工部：我只画图纸，其他的找别人干去。\n");
    }
}
