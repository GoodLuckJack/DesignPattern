package com.gtja.pattern;

import java.util.Scanner;

public class DesignPatternManager {
    public static void main(String[] args) {

        System.out.print("Right below is Design Pattern Performance!\n");
        System.out.print("******************************************\n");
        System.out.print("Exit!---------------------" + "0\n");
        System.out.print("PERFORMER_MEDIATOR -------" + "1\n");
        System.out.print("PERFORMER_ENCAPSULATE-----" + "2\n\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input a number : ");

        String input = scanner.next();

        if (input != null) {
            int inputInt = Integer.valueOf(input);
            Performer performer = DesignPatternFactory.createPerformer(inputInt);
            performer.perform();
        }
    }
}
