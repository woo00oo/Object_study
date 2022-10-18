package com.example.object.chapter10;

public class PersonalPlaylist extends Playlist {

    public void remove(Song song) {
        getTracks().remove(song);
        getSingers().remove(song.getSinger());
    }
}
