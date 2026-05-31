package com.sjh14o3.singleton.music_player;

public class ClassicPlayer extends MusicPlayer {
    public static MusicPlayer getInstance() {
        if (instance == null) {
            instance = new ClassicPlayer();
        }
        return instance;
    }

    @Override
    protected String play() {
        return "currently playing classic";
    }
}
