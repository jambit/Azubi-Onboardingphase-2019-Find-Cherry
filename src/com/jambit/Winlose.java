package com.jambit;

public class Winlose {
    public boolean checkCherry() {
        Rooms bridge = new Rooms();
        if (Rooms.playerLocation == Meetingroom.gen) {     // todo
            System.out.println("Yeah cherry is here");
            System.out.println("Epic Victory Royal");
            System.out.println("");
            System.exit(0);
            //   bridge.chooceARoom();

            return true;
        } else {
            System.out.println("Cherry is not here");
            System.out.println("Try again");
            bridge.chooceARoom();
            return false;
        }
    }
}