package com.gtja.pattern.mediator;

import com.gtja.pattern.Performer;

public class MediatorPerformer extends Performer {

    public MediatorPerformer() {
    }

    @Override
    public void perform() {
        AbstractMediator mediator = new Mediator();

        Department department = new Department(mediator);
        department.dealDisaster();

        Defense defense = new Defense(mediator);
        defense.fight();

        Ministry ministry = new Ministry(mediator);
        ministry.buildPalace();
    }
}
