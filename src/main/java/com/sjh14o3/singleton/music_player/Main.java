package com.sjh14o3.singleton.music_player;

public class Main {
    public static void main(String[] args) {
        MusicPlayer mp = MusicPlayer.getInstance();
        System.out.println(mp.play());

        MusicPlayer.reset();

        mp = PopPlayer.getInstance();
        System.out.println(mp.play());

        MusicPlayer.reset();

        mp = CountryPlayer.getInstance();
        System.out.println(mp.play());
    }
}
