package com.jambit;

public class Main {

    public static void main(String[] args) {
        System.out.println("Wilkommen bei jambit");
        System.out.println("Dein Ziel ist es Cherry zu finden");
        Map bridge = new Map();
        //Rooms bridge2 = new Rooms();
        bridge.bigpicture();
        Meetingroom sumatra = new Meetingroom();
        Meetingroom lombok = new Meetingroom();
        Meetingroom biang = new Meetingroom();
        Meetingroom deli = new Meetingroom();
        Meetingroom kalimantan = new Meetingroom();
        Meetingroom toko = new Meetingroom();
        Randomizer lol = new Randomizer();
        lol.placeholder(lombok, biang, deli, toko, kalimantan);

        Kitchen java = new Kitchen();
        Extern eastergg = new Extern();
        Office TAs = new Office();
        Toilet WC = new Toilet();
        TA reception = new TA();


    }


}
