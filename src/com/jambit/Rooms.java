package com.jambit;

import java.util.Scanner;


public class Rooms {
    Scanner sc = new Scanner(System.in);
    public String name;
    public boolean cherryStatus;
    Meetingroom lombok = new Meetingroom();
    Meetingroom biang = new Meetingroom();
    Meetingroom deli = new Meetingroom();
    Meetingroom toko = new Meetingroom();
    Meetingroom kalimantan = new Meetingroom();
    public static int playerLocation;


//    public int quickmaths() {
//        int willbegonesoon = (int) (Math.random() * 2);
//        return willbegonesoon;
//    }

    public void chooceARoom() {

        System.out.println("");
        Overview epic = new Overview(); //todo: better name?
        System.out.println(epic.choices());
        Meetingroom rooms = new Meetingroom();

        while (true) {
            String input = sc.nextLine();
            switch (input) {
                case "Sumatra":
                case "s":
                    rooms.enterSumatra(); //Todo: Thats a good name :)
                    break;
                case "Lombok":
                case "l":
                    rooms.enterLombok();
                    playerLocation = 1;
                    break;
                case "Rezeption":
                case "i":
                    TA enterrezeption = new TA();
                    enterrezeption.reception();
                    break;
                case "TA-Office":
                case "5":
                    Office enterTaOffice = new Office();
                    enterTaOffice.taoffice();
                    break;
                case "enterTreppenhaus":
                case "th":
                    Extern enterTreppenhaus = new Extern();
                    enterTreppenhaus.easteregg();
                    break;
                case "DamenToilette":
                case "dt":
                    Toilet damentoilette = new Toilet();
                    damentoilette.DT();
                    break;
                case "HerrenToilette":
                case "ht":
                    Toilet herrentoilette = new Toilet();
                    herrentoilette.HT();

                    break;
                case "Biang":
                case "7":
                    Meetingroom biangg = new Meetingroom();
                    biangg.biang();
                    playerLocation = 3;
                    break;
                case "Deli":
                case "9":
                    Meetingroom delii = new Meetingroom();
                    delii.deli();
                    playerLocation = 4;
                    break;
                case "Java":
                case "j":
                    Kitchen toto5 = new Kitchen();
                    toto5.java();
                    break;
                case "Toko":
                case "11":
                    toko.toko(toko);
                    playerLocation = 5;
                    break;
                case "Kalimantan":
                case "k":
                    Meetingroom kalimantann = new Meetingroom();
                    kalimantan.kalimantan(kalimantan);
                    playerLocation = 2;
                    break;

            }


        }
    }
}
