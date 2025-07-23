package com.example.democosmosdb.pattern.proxy;

public class MediaPlayProxy implements MediaPlayer {
    private MediaPlayer mediaPlayer;

    @Override
    public void playMedia() {
        if (mediaPlayer ==  null) {
            mediaPlayer = new MovieMediaPlayer();
        }
        mediaPlayer.playMedia();

    }
}
