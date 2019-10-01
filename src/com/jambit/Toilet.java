package com.jambit;

public class Toilet {
    Clearing bridge = new Clearing();
    public void HT(){
        Rooms bridge2 = new Rooms();
        bridge.clear();
        Blueprints blueprints = new Blueprints();
        blueprints.printDT();
        System.out.println("Sofern Cherry hier wäre, würden wir ihn nun wirklich nicht stören wollen. Probiere einen anderen Raum.");
        bridge2.chooceARoom();
    }
    public void DT(){
        Rooms bridge = new Rooms();
        this.bridge.clear();
        Blueprints blueprints = new Blueprints();
        blueprints.printDT();
        System.out.println("Würde Cherry hier sein, hätte er ein ernstes Problem.");
        bridge.chooceARoom();
    }
}

