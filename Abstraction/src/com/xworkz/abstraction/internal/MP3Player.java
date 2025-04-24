package com.xworkz.abstraction.internal;

public class MP3Player implements  MediaPlayer {

    @Override
    public void Play() {
        System.out.println("Playing in MP3 player");
    }
}
