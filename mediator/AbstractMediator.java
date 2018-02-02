package com.gtja.pattern.mediator;

public abstract class AbstractMediator {
    protected Defense mDefense;
    protected Department mDepartment;
    protected Ministry mMinistry;

    public AbstractMediator() {
        mDefense = new Defense(this);
        mDepartment = new Department(this);
        mMinistry = new Ministry(this);
    }

    public abstract void manageAffairs(int affairCode);
}
