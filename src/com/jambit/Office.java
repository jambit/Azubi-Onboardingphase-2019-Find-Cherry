package com.jambit;

public class Office {
    Clearing bridge = new Clearing();
    Winlose bridge2 = new Winlose();

    public void taoffice() {
        Rooms Bue = new Rooms();
        bridge.clear();
        System.out.println("Du bist jetzt bei den TAs.");
        if (!bridge2.checkCherry())
            Bue.chooceARoom();
    }
}
