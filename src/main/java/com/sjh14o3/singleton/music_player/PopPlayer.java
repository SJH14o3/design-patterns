package com.sjh14o3.singleton.music_player;

public class PopPlayer extends MusicPlayer {
    public static MusicPlayer getInstance() {
        if (instance == null) {
            instance = new PopPlayer();
        }
        return instance;
    }

    @Override
    protected String play() {
        return "currently playing pop";
    }
}
