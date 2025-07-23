package com.example.democosmosdb.pattern.state.forme;

public class PlayingState implements MediaPlayerState {

    @Override
    public void pressButton(MediaPlayer mediaPlayer) {
        mediaPlayer.pause();
        mediaPlayer.setState(new PausedState());
    }
}
