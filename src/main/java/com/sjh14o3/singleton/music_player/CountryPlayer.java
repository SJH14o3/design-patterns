package com.sjh14o3.singleton.music_player;

public class CountryPlayer extends MusicPlayer {
    public static MusicPlayer getInstance() {
        if (instance == null) {
            instance = new CountryPlayer();
        }
        return instance;
    }

    @Override
    protected String play() {
        return "currently playing country";
    }
}
