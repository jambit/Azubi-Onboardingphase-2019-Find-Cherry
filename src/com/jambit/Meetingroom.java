package com.jambit;

import java.util.Scanner;

public class Meetingroom {
    Clearing clearing = new Clearing();
    Winlose bridge2 = new Winlose();
    Blueprints blueprints = new Blueprints();
    public static int gen;

    boolean Cherry = false;

    public int Generator() {
        gen = (int) (Math.random() * 6);
        return gen;
    }

    public void setCherry(boolean cherry) {
        Cherry = cherry;
    }

    public boolean isCherry() {
        return Cherry;
    }


    public void enterSumatra() {
        Rooms sum = new Rooms();
        clearing.clear();
        blueprints.printSumatra();
        System.out.println("Sumatra ist gerade von den erstjahr Azubis belegt, welche Text based RPGs vorstellen.");

        sum.chooceARoom();
    }

    public void enterLombok() {
        Rooms lom = new Rooms();
        clearing.clear();
        blueprints.printprintLombok();
        System.out.println("Du bist jetzt im Lombok.");
        if (bridge2.checkCherry()) {
            lom.chooceARoom();
        }
    }

    public void biang() {
        Rooms bia = new Rooms();
        clearing.clear();
        blueprints.printBiang();
        System.out.println("Du bist jetzt im Biang.");
        if (!bridge2.checkCherry())
            bia.chooceARoom();
    }

    public void deli() {
        Rooms del = new Rooms();
        clearing.clear();
        blueprints.printDeli();
        System.out.println("Du bist jetzt im Deli.");
        if (!bridge2.checkCherry())
            del.chooceARoom();
    }

    public void kalimantan(Meetingroom kallim) {
        Rooms kal = new Rooms();
        clearing.clear();
        blueprints.printKalimantan();
        System.out.println("Bist du sicher, dass du ins Kalimantan willst?");
        System.out.println("| ja | nein |");
        Scanner sc = new Scanner(System.in);

        boolean role = false;
        while (!role) {
            String input = sc.nextLine();
            if (input.equals("ja")) {  //Todo: think about reasonable variable names ;)
                role = true;
                clearing.clear();
                System.out.println("Obwohl hier niemand gerne sein will, bist du dennoch jetzt im Kalimantan.");
                if (kallim.isCherry()) {
                    System.out.println("Yuhuuuu hier ist Cherry");

                } else {
                    kal.chooceARoom();
                }

            } else if (input.equals("nein")) {
                role = true;
                System.out.println("Gute Entscheidung");
                kal.chooceARoom();
            }
        }
    }

    public void toko(Meetingroom toko) {
        Rooms tok = new Rooms();
        clearing.clear();
        blueprints.printToko();
        System.out.println("Du bist jettz im Toko.");
        if (toko.isCherry()) {
            System.out.println("Yuhuuuu hier ist Cherry");
        } else {
            tok.chooceARoom();
        }
    }

  /*  public void kalimantan(Meetingroom kalimantan) {

        clearing.clear();
        System.out.println("Du bist jettz im Toko.");
        if (kalimantan.isCherry()) {
            System.out.println("Yuhuuuu hier ist Cherry");
        } else {
            Rooms kal = new Rooms();
            kal.chooceARoom();
        }
    }*/

    public void lombock(Meetingroom lombok) {
        Rooms lom = new Rooms();
        clearing.clear();
        System.out.println("Du bist jettz im Toko.");
        if (lombok.isCherry()) {
            System.out.println("Yuhuuuu hier ist Cherry");
        } else {
            lom.chooceARoom();
        }
    }

    public void deli(Meetingroom deli) {
        Rooms del = new Rooms();
        clearing.clear();
        System.out.println("Du bist jettz im Toko.");
        if (deli.isCherry()) {
            System.out.println("Yuhuuuu hier ist Cherry");
        } else {
            del.chooceARoom();
        }
    }

    public void biang(Meetingroom biang) {
        Rooms bia = new Rooms();
        clearing.clear();
        System.out.println("Du bist jettz im Toko.");
        if (biang.isCherry()) {
            System.out.println("Yuhuuuu hier ist Cherry");
        } else {
            bia.chooceARoom();
        }
    }
}