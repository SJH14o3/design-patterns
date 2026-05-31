package com.sjh14o3.singleton.music_player;

public abstract class MusicPlayer {
    protected static MusicPlayer instance;

    public static MusicPlayer getInstance() {
        if (instance == null) {
            instance = new ClassicPlayer();
        }
        return instance;
    }

    protected MusicPlayer() {}

    protected abstract String play();

    // this is just for demonstration
    public static void reset() {
        instance = null;
    }
}
