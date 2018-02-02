package com.gtja.pattern.mediator;

public class Mediator extends AbstractMediator{

    public static final int AFFAIR_DEPARTMENT = 0;
    public static final int AFFAIR_DEFENSE = 1;
    public static final int AFFAIR_MINISTRY = 2;

    @Override
    public void manageAffairs(int affairCode) {
        switch (affairCode) {
            case AFFAIR_DEPARTMENT:
                dealDisaster();
                break;
            case AFFAIR_DEFENSE:
                fight();
                break;
            case AFFAIR_MINISTRY:
                buildPalace();
                break;
        }
    }

    private void dealDisaster() {
        super.mMinistry.doSelfWork();
        super.mDefense.doSelfWork();
    }

    private void fight() {
        super.mDepartment.doSelfWork();
        super.mMinistry.doSelfWork();
    }

    private void buildPalace() {
        super.mDepartment.doSelfWork();
        super.mDefense.doSelfWork();
    }
}
