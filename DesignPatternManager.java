package com.gtja.pattern;

public class DesignPatternManager {
    public static void main(String[] args) {

        Performer performer = DesignPatternFactory.createPerformer(DesignPatternFactory.PERFORMER_MEDIATOR);
        performer.perform();
    }
}
