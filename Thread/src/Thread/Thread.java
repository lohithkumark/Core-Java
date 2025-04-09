package Thread;

import Cotton.Cotton;  // Importing Cotton class

public class Thread extends Cotton {
    // Attributes of Thread
    int lengthInMeters;
    boolean isDyed;

    public void spin() {
        System.out.println("Spinning the thread...");
    }

    public void dye() {
        System.out.println("Dyeing the thread...");
    }
}
