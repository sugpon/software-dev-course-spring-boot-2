package com.example.mycollections.models;

public class Album extends LibraryItem {
    private String name;
    private  String artist;
    private int year;
    private int trackCount;

    public Album(String name, String artist, int year, int trackCount) {
        super(name, year);
        this.artist = artist;
        this.trackCount = trackCount;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int gettrackCount() {
        return trackCount;
    }

    public void setTrackCount(int trackCount) {
        this.trackCount = trackCount;
    }

    @Override
    public String toString() {
        return getName() + " Sung by the Artist " + artist + " (" + getYear() + "), with " + trackCount + " tracks";
    }
}

