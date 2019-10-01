package com.jambit;


public class TA {
    public void reception() {
        Rooms bridge = new Rooms();
        Clearing bridge2 = new Clearing();
        bridge2.clear();

        Blueprints printReception = new Blueprints();
        printReception.printReception();
        System.out.println("Du bist jetzt bei der Reception");
        System.out.println("Alma: Hey! was kann ich für dich tun?");
        System.out.println("");
        System.out.println("Was willst du Fragen:");
        System.out.println("1. Hey, weißt du wo Cherry ist?");
        System.out.println("2. Was machst du Alma?");
        int what = bridge.sc.nextInt();
        if (what == 1) {
            bridge2.clear();
            System.out.println("Hey weißt du wo Cherry ist?");
            System.out.println("Alma: ja, Cherry müsste im 3 Stock sein sein");
            bridge.chooceARoom();
        } else if (what == 2) {
            bridge2.clear();
            System.out.println("Was machst du Alma?");
            System.out.println("Alma: >:( ?#@*&%!");
            bridge.chooceARoom();
        }
    }
}
