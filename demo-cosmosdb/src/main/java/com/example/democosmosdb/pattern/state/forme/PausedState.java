package com.example.democosmosdb.pattern.state.forme;

public class PausedState implements MediaPlayerState {
    @Override
    public void pressButton(MediaPlayer mediaPlayer) {
        mediaPlayer.play();
        mediaPlayer.setState(new PlayingState());
    }
}
