package com.xworkz.abstraction.internal;

public class MediaApp {

    private MediaPlayer mediaPlayer;


    public MediaApp(MediaPlayer mediaPlayer)
    {
        this.mediaPlayer = null;
    }

    public void PlayMusic() {
        if (this.mediaPlayer != null){
            this.mediaPlayer.Play();
    }
        else
        {
            System.out.println("Media is Null");
        }
}
    }


