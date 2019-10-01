package com.jambit;

public class Randomizer {
    public void placeholder(Meetingroom lombock, Meetingroom biang, Meetingroom deli, Meetingroom toko, Meetingroom kalimantan) {   // TODO: 27-Sep-19 neuer name einfügen
        Meetingroom newer = new Meetingroom();
        switch (newer.Generator()) {
            case 1:
                lombock.setCherry(true);
                break;
            case 2:
                biang.setCherry(true);
                break;
            case 3:
                deli.setCherry(true);
                break;
            case 4:
                toko.setCherry(true);
                break;
            case 5:
                kalimantan.setCherry(true);
                break;
        }

        Rooms start = new Rooms();
        start.chooceARoom();

    }
}